package a17_smarthomedevice;

public class Main {
    public static void main(String[] args) {
        
        // Creating instances of different smart devices
        SmartLight smartLight = new SmartLight("Light");
        SmartSpeaker smartSpeaker = new SmartSpeaker("Speaker");
        SmartThermostat smartThermostat = new SmartThermostat("Thermostat");

        System.out.println("Smart Light:");
        smartLight.turnOn();
        smartLight.showStatus();
        smartLight.turnOff();

        System.out.println("\nSmart Speaker:");
        smartSpeaker.turnOn();
        smartSpeaker.showStatus();
        smartSpeaker.turnOff();

        System.out.println("\nSmart Thermostat:");
        smartThermostat.turnOn();
        smartThermostat.showStatus();
        smartThermostat.turnOff();
    }
}