package devices;

import connection.ConnectionManager;

public class SmartDevice {
    private ConnectionManager connectionManager;

    public SmartDevice() {
        this.connectionManager = ConnectionManager.getInstance();
    }

    public void sendData(String data) {
        if (connectionManager.isConnected()) {
            System.out.println("Enviando dados: " + data);
        } else {
            System.out.println("Dispostivo não está conectado ao servidor central");
        }
    }
}
