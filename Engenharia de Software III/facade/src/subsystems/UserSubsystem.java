package subsystems;

public class UserSubsystem {
    public void registerUser(String name) {
        System.out.println("Registrando usuário: " + name);
    }

    public void removeUser(String name) {
        System.out.println("Removendo usuário: " + name);
    }
}