package subsystems;

public class BookSubsystem {
    public void findBook(String title) {
        System.out.println("Encontrando livro: " + title);
    }

    public void checkoutBook(String title) {
        System.out.println("Emprestando livro: " + title);
    }

    public void returnBook(String title) {
        System.out.println("Devolvendo livro: " + title);
    }
}