package observer;

import java.util.ArrayList;
import java.util.List;

import strategy.DeviceControlStrategy;

public class Device implements DeviceStatusSubject {
    private List<DeviceStatusObserver> observers = new ArrayList<>();
    private String status;
    private DeviceControlStrategy controlStrategy;

    public void setControlStrategy(DeviceControlStrategy controlStrategy) {
        this.controlStrategy = controlStrategy;
    }

    public void control() {
        if (controlStrategy != null) {
            controlStrategy.control();
        } else {
            System.out.println("Nenhuma strategy de controle para este dispositivo.");
        }
    }

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
