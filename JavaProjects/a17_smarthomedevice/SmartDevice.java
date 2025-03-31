package a17_smarthomedevice;

/**
 * Abstract class representing a Smart Device.
 * All smart devices will inherit from this class and must implement the turnOn() and turnOff() methods.
 */
abstract class SmartDevice {
    String deviceName;

    /**
     * Constructor to initialize the device name.
     * 
     * @param deviceName Device's name.
     */
    SmartDevice(String deviceName) {
        this.deviceName = deviceName;
    }

    /** Abstract method to turn on the device. */
    abstract void turnOn();

    /** Abstract method to turn off the device. */
    abstract void turnOff();

    /**
     * Displays the device's name.
     * This is a concrete method that can be used by all subclasses.
     */
    public void showStatus() {
        System.out.println("Device: Smart " + deviceName);
    }
}