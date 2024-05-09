package observer;

public interface DeviceStatusSubject {
    void registerObserver(DeviceStatusObserver observer);
    void removeObserver(DeviceStatusObserver observer);
    void notifyObservers();
}