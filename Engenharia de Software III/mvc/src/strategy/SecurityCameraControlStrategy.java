package strategy

public class SecurityCameraControlStrategy implements DeviceControlStrategy {
    @Override
    public void control() {
        System.out.println("Controlling security cameras...");
    }
}