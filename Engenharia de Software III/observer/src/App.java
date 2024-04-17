public class App {
    public static void main(String[] args) {
        Stock stock = new Stock("QQCS", 150.0);
        Investor investor1 = new ConcreteInvestor("Pedro");
        Investor investor2 = new ConcreteInvestor("Henrique");

        stock.attach(investor1);
        stock.attach(investor2);

        stock.setPrice(155.0);
    }
}
