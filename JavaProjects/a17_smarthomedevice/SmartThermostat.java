package a17_smarthomedevice;

/**
 * Class representing a Smart Thermostat device.
 * Inherits from SmartDevice and provides specific implementations for turning on and off the thermostat.
 */
public class SmartThermostat extends SmartDevice {
    
    /**
     * Constructor to initialize the Smart Thermostat with its name.
     * 
     * @param deviceName Smart thermostat device's name.
     */
    SmartThermostat(String deviceName) {
        super(deviceName);
    }

    /** Turns on the Smart Thermostat. */
    @Override
    public void turnOn() {
        System.out.println(deviceName + " is now set to 22°C");
    }

    /** Turns on the Smart Thermostat. */
    @Override
    public void turnOff() {
        System.out.println(deviceName + " is turned off");
    }
}