package a17_smarthomedevice;

/**
 * Class representing a Smart Speaker device.
 * Inherits from SmartDevice and provides specific implementations for turning on and off the speaker.
 */
public class SmartSpeaker extends SmartDevice {
    
    /**
     * Constructor to initialize the Smart Speaker with its name.
     * 
     * @param deviceName Smart speaker device's name.
     */
    SmartSpeaker(String deviceName) {
        super(deviceName);
    }

    /** Turns on the Smart Speaker. */
    @Override
    public void turnOn() {
        System.out.println(deviceName + " is now playing music");
    }

    /** Turns on the Smart Speaker. */
    @Override
    public void turnOff() {
        System.out.println(deviceName + " is now OFF");
    }
}