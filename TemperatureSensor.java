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

public class TemperatureSensor extends TemperatureSensorBase {
    
    public TemperatureSensor( String[] args ) throws Exception {
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

        // initialization
        double temperature=0.0;
        int i=1;

        //Detect the board we are running on
        Board board = Platform.createBoard();
        int deviceAddress = 0x18;

        // sensor configuration
        I2cBus bus = board.getI2cBus(BBBNames.I2C_1);
        TemperatureSensorDevice sensor = new TemperatureSensorDevice(bus, deviceAddress);
        int config = sensor.readConfiguration(1);
        int mfgId = sensor.readManufacturingId(6);
        int deviceId = sensor.readDeviceId(7);

        System.out.println("config=:" + config);
        System.out.println("MfgId=:" + mfgId);
        System.out.println("DeviceId=:" + deviceId);

        while( true ) {
            currentTime += 1;

            atr.requestSyncStart();

            temperature = sensor.readTemperature(5);
            System.out.println("Temperature=:" + temperature);

    		SensorMessage sensor_msg = create_SensorMessage();
    		sensor_msg.set_temperature( temperature );
    		sensor_msg.sendInteraction( getRTI(), currentTime );

            AdvanceTimeRequest newATR = new AdvanceTimeRequest( currentTime );
            putAdvanceTimeRequest( newATR );

            atr.requestSyncEnd();
            atr = newATR;
        }

    }

    public static void main( String[] args ) {
        try {
            TemperatureSensor sensor = new TemperatureSensor( args );
            sensor.execute();
        } catch ( Exception e ) {
            System.err.println( "Exception caught: " + e.getMessage() );
            e.printStackTrace();
        }
    }
}
