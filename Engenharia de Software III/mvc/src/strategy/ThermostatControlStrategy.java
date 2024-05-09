package strategy

public class ThermostatControlStrategy implements DeviceControlStrategy {
    @Override
    public void control() {
        System.out.println("Controlling thermostat...");
    }
}