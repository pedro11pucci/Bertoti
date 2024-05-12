package connection;

public class ConnectionManager {
    private static ConnectionManager instance;
    private boolean isConnected;

    private ConnectionManager() {
        isConnected = false;
    }

    public static ConnectionManager getInstance() {
        if (instance == null) {
            instance = new ConnectionManager();
        }
        return instance;
    }

    public void connect() {
        isConnected = true;
        System.out.println("Conectado ao servidor central");
    }

    public void disconnect() {
        isConnected = false;
        System.out.println("Desconectado do servidor central");
    }

    public boolean isConnected() {
        return isConnected;
    }
}
