import composite.DeviceComponent;
import composite.Room;
import observer.Device;
import observer.DeviceStatusObserver;
import observer.User;
import strategy.DeviceControlStrategy;
import strategy.LightControlStrategy;
import strategy.SecurityCameraControlStrategy;
import strategy.ThermostatControlStrategy;

public class App {

    public static void main(String[] args) {
        Device light = new Device();
        Device thermostat = new Device();
        Device securityCamera = new Device();

        DeviceControlStrategy lightControlStrategy = new LightControlStrategy();
        DeviceControlStrategy thermostatControlStrategy = new ThermostatControlStrategy();
        DeviceControlStrategy securityCameraControlStrategy = new SecurityCameraControlStrategy();

        light.setControlStrategy(lightControlStrategy);
        thermostat.setControlStrategy(thermostatControlStrategy);
        securityCamera.setControlStrategy(securityCameraControlStrategy);

        Room livingRoom = new Room();
        Room kitchen = new Room();
        Room house = new Room();

        livingRoom.addComponent(new DeviceComponent(light));
        kitchen.addComponent(new DeviceComponent(thermostat));
        house.addComponent(livingRoom);
        house.addComponent(kitchen);
        house.addComponent(new DeviceComponent(securityCamera));

        DeviceStatusObserver user1 = new User("Victor");
        DeviceStatusObserver user2 = new User("Aluízio");

        light.registerObserver(user1);
        light.registerObserver(user2);
        thermostat.registerObserver(user1);
        securityCamera.registerObserver(user2);

        light.setStatus("Ligado");
        thermostat.setStatus("Resfriando");
        securityCamera.setStatus("Gravando");

        house.control();
    }
}
