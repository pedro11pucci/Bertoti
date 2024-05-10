package observer;

public class User implements DeviceStatusObserver {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String status) {
        System.out.println(name + " recebeu notificação: Estado do dispositivo alterado para " + status);
    }
}