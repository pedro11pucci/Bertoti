package composite;

public class DeviceComponent implements RoomComponent {
    private Device device;

    public DeviceComponent(Device device) {
        this.device = device;
    }

    @Override
    public void control() {
        device.control();
    }
}