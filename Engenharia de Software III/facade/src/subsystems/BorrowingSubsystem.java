package subsystems;

public class BorrowingSubsystem {
    public void borrowBook(String title, String userName) {
        System.out.println("Emprestando livro: " + title + " for user: " + userName);
    }

    public void returnBorrowedBook(String title, String userName) {
        System.out.println("Devolvendo livro emprestado: " + title + " for user: " + userName);
    }
}