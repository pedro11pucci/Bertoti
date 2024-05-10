package strategy;

public class SecurityCameraControlStrategy implements DeviceControlStrategy {
    @Override
    public void control() {
        System.out.println("Controlando câmeras de segurança...");
    }
}