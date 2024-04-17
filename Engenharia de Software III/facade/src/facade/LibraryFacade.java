package facade;

import subsystems.BookSubsystem;
import subsystems.BorrowingSubsystem;
import subsystems.UserSubsystem;

public class LibraryFacade {
    private BookSubsystem bookSubsystem;
    private UserSubsystem userSubsystem;
    private BorrowingSubsystem borrowingSubsystem;

    public LibraryFacade() {
        this.bookSubsystem = new BookSubsystem();
        this.userSubsystem = new UserSubsystem();
        this.borrowingSubsystem = new BorrowingSubsystem();
    }

    public void findAndCheckoutBook(String title, String userName) {
        bookSubsystem.findBook(title);
        bookSubsystem.checkoutBook(title);
        userSubsystem.registerUser(userName);
        borrowingSubsystem.borrowBook(title, userName);
    }

    public void returnBorrowedBook(String title, String userName) {
        bookSubsystem.returnBook(title);
        userSubsystem.removeUser(userName);
        borrowingSubsystem.returnBorrowedBook(title, userName);
    }
}