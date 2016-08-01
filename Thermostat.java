package BBBHelloWorld;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.IOException;
import java.util.Properties;

import c2w.hla.InteractionRoot;

public class Thermostat extends ThermostatBase {
    
    public Thermostat( String[] args ) throws Exception {
        super( args );
    }
    
    private void execute() throws Exception {
        double currentTime = 0;

        AdvanceTimeRequest atr = new AdvanceTimeRequest( currentTime );
        putAdvanceTimeRequest( atr );

        readyToPopulate();
        readyToRun();

        startAdvanceTimeThread();

        InteractionRoot interactionRoot;

        String mode = "auto";
        double setpoint = 25; // deg C
        double tolerance = 0.5; // deg C

        // look for a properties file that overwrites the default values
        Properties config = new Properties();
        InputStream input = null;
        try {
            input = new FileInputStream("Thermostat.properties");

            config.load(input);
            mode = config.getProperty("mode");
            setpoint = Double.parseDouble( config.getProperty("setpoint") );
            tolerance = Double.parseDouble( config.getProperty("tolerance") );
        } catch( IOException ex ) {
            System.out.println("Couldn't find Thermostat.properties; using default values");
        } finally {
            if( input != null ) {
                input.close();
            }
        }

        // initialization
        boolean heaterOn = false;
        boolean coolerOn = false;
        boolean fan1On = false;
        boolean fan2On = false;
        double temperature = 0;

        // use the mode to set the capabilities of the thermostat	
        mode = mode.toLowerCase();
        boolean canHeat = mode.charAt(0) == 'h' || mode.charAt(0) == 'a';
        boolean canCool = mode.charAt(0) == 'c' || mode.charAt(0) == 'a';

        while( true ) {
            currentTime += 1;
            atr.requestSyncStart();

            while (  ( interactionRoot = getNextInteractionNoWait() ) != null ) {
        		SensorMessage msg = (SensorMessage)interactionRoot;
        		temperature = msg.get_temperature();

                if( setpoint - temperature > tolerance && canHeat ) {
                    coolerOn = false;
                    heaterOn = true;
                    fan1On = false;
                    fan2On = false;
                    System.out.println("Turned on heating to reach " + setpoint + " degrees C");
                }
                else if( temperature - setpoint > tolerance && canCool ) {
                    coolerOn = true;
                    heaterOn = false;
                    fan1On = true;
                    fan2On = true;
                    System.out.println("Turned on cooling to reach " + setpoint + " degrees C");
                }
                else {
                    coolerOn = false;
                    heaterOn = false;
                    fan1On = false;
                    fan2On = false;
                    System.out.println("Turned off HVAC system");
                }
            }

  	        ControlMessage msg = create_ControlMessage();
            msg.set_cooling( coolerOn );
   	        msg.set_heating( heaterOn );
            msg.set_fan1( fan1On );
   	        msg.set_fan2( fan2On );
       	    msg.sendInteraction( getRTI(), currentTime );

            AdvanceTimeRequest newATR = new AdvanceTimeRequest( currentTime );
            putAdvanceTimeRequest( newATR );

            atr.requestSyncEnd();
            atr = newATR;
        }
    }

    public static void main( String[] args ) {
        try {
            Thermostat thermostat = new Thermostat( args );
            thermostat.execute();
        } catch ( Exception e ) {
            System.err.println( "Exception caught: " + e.getMessage() );
            e.printStackTrace();
        }
    }
}

