package strategy

public class LightControlStrategy implements DeviceControlStrategy {
    @Override
    public void control() {
        System.out.println("Controlling lights...");
    }
}