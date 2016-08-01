package BBBHelloWorld;
        
import c2w.hla.InteractionRoot;

import java.io.IOException;

import org.bulldog.beagleboneblack.BBBNames;
import org.bulldog.core.Signal;
import org.bulldog.core.gpio.DigitalOutput;
import org.bulldog.core.platform.Board;
import org.bulldog.core.platform.Platform;
import org.bulldog.core.util.BulldogUtil;
import org.bulldog.core.io.bus.i2c.I2cBus;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

public class HVAC extends HVACBase {
    
    public HVAC( String[] args ) throws Exception {
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

        //Detect the board we are running on
        Board board = Platform.createBoard();

        //Set up a digital output
        DigitalOutput relay3Fan1 = board.getPin(BBBNames.P9_30).as(DigitalOutput.class);
        relay3Fan1.write(Signal.High);
        DigitalOutput relay4Fan2 = board.getPin(BBBNames.P9_27).as(DigitalOutput.class);
        relay4Fan2.write(Signal.High);
        DigitalOutput relay1Heating = board.getPin(BBBNames.P9_15).as(DigitalOutput.class);
        relay1Heating.write(Signal.High);
        DigitalOutput relay2Cooling = board.getPin(BBBNames.P9_23).as(DigitalOutput.class);
        relay2Cooling.write(Signal.High);

        while( true ) {
            currentTime += 1;

            atr.requestSyncStart();

            while(  ( interactionRoot = getNextInteractionNoWait() ) != null ) {
                ControlMessage msg = (ControlMessage)interactionRoot;
                System.out.println( "HVAC: Received ControlMessage interaction" );

                boolean fan1On = msg.get_fan1();
                boolean fan2On = msg.get_fan2();
                boolean heaterOn = msg.get_heating();
                boolean coolerOn = msg.get_cooling();

                if (heaterOn)
                    relay1Heating.write(Signal.Low);
                else
                    relay1Heating.write(Signal.High);
                if (coolerOn)
                    relay2Cooling.write(Signal.Low);
                else
                    relay2Cooling.write(Signal.High);
                if (fan1On)
                    relay3Fan1.write(Signal.Low);
                else
                    relay3Fan1.write(Signal.High);
                if (fan2On)
                    relay4Fan2.write(Signal.Low);
                else
                    relay4Fan2.write(Signal.High);
            }

            AdvanceTimeRequest newATR = new AdvanceTimeRequest( currentTime );
            putAdvanceTimeRequest( newATR );

            atr.requestSyncEnd();
            atr = newATR;
        }
    }

    public static void main( String[] args ) {
        try {
            HVAC hvac = new HVAC( args );
            hvac.execute();
        } catch ( Exception e ) {
            System.err.println( "Exception caught: " + e.getMessage() );
            e.printStackTrace();
        }
    }
}
