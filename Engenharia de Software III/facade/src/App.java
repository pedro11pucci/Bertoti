import facade.LibraryFacade;

public class App {
    public static void main(String[] args) {
        LibraryFacade libraryFacade = new LibraryFacade();
        libraryFacade.findAndCheckoutBook("A Batalha do Apocalipse", "Pedro");
        libraryFacade.returnBorrowedBook("A Batalha do Apocalipse", "Pedro");
    }
}
