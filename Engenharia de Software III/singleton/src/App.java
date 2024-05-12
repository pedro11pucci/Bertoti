import connection.ConnectionManager;
import devices.SmartDevice;

public class App {
    public static void main(String[] args) {
        ConnectionManager connectionManager = ConnectionManager.getInstance();
        connectionManager.connect();

        if (connectionManager.isConnected()) {
            SmartDevice device = new SmartDevice();
            device.sendData("Olá do dispositivo");
        }

        connectionManager.disconnect();
    }
}
