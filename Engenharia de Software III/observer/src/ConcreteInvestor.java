public class ConcreteInvestor implements Investor {
    private String name;

    public ConcreteInvestor(String name) {
        this.name = name;
    }

    @Override
    public void update(Stock stock) {
        System.out.println(name + " - Preço de " + stock.getSymbol() + " mudou para " + stock.getPrice());
    }
}