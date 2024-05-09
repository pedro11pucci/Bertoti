package observer;

public class Device implements DeviceStatusSubject {
    private List<DeviceStatusObserver> observers = new ArrayList<>();
    private String status;

    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }

    @Override
    public void registerObserver(DeviceStatusObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(DeviceStatusObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (DeviceStatusObserver observer : observers) {
            observer.update(status);
        }
    }
}