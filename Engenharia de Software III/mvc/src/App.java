public class App {

    public static void main(String[] args) {
        // Create devices
        Device light = new Device();
        Device thermostat = new Device();
        Device securityCamera = new Device();

        // Create strategies for controlling devices
        DeviceControlStrategy lightControlStrategy = new LightControlStrategy();
        DeviceControlStrategy thermostatControlStrategy = new ThermostatControlStrategy();
        DeviceControlStrategy securityCameraControlStrategy = new SecurityCameraControlStrategy();

        // Set control strategies for devices
        light.setControlStrategy(lightControlStrategy);
        thermostat.setControlStrategy(thermostatControlStrategy);
        securityCamera.setControlStrategy(securityCameraControlStrategy);

        // Create rooms
        Room livingRoom = new Room();
        Room kitchen = new Room();
        Room house = new Room();

        // Add devices to rooms
        livingRoom.addComponent(new DeviceComponent(light));
        kitchen.addComponent(new DeviceComponent(thermostat));
        house.addComponent(livingRoom);
        house.addComponent(kitchen);
        house.addComponent(new DeviceComponent(securityCamera));

        // Create users
        DeviceStatusObserver user1 = new User("Alice");
        DeviceStatusObserver user2 = new User("Bob");

        // Register users as observers for device status
        light.registerObserver(user1);
        light.registerObserver(user2);
        thermostat.registerObserver(user1);
        securityCamera.registerObserver(user2);

        // Simulate changing device status
        light.setStatus("On");
        thermostat.setStatus("Cooling");
        securityCamera.setStatus("Recording");

        // Control devices in the house
        house.control();
    }
}
