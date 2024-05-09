package observer;

public class User implements DeviceStatusObserver {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String status) {
        System.out.println(name + " received notification: Device status changed to " + status);
    }
}