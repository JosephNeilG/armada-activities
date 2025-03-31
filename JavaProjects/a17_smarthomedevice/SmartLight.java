package a17_smarthomedevice;

/**
 * Class representing a Smart Light device.
 * Inherits from SmartDevice and provides specific implementations for turning on and off the light.
 */
public class SmartLight extends SmartDevice {

    /**
     * Constructor to initialize the Smart Light with its name.
     * 
     * @param deviceName Smart light device's name.
     */
    SmartLight(String deviceName) {
        super(deviceName);
    }

    /** Turns on the Smart Light. */
    @Override
    public void turnOn() {
        System.out.println(deviceName + " is now ON");
    }

    /** Turns off the Smart Light. */
    @Override
    public void turnOff() {
        System.out.println(deviceName + " is now OFF");
    }
}