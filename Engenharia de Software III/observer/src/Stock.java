import java.util.ArrayList;
import java.util.List;

public class Stock {
    private String symbol;
    private double price;
    private List<Investor> investors;

    public Stock(String symbol, double price) {
        this.symbol = symbol;
        this.price = price;
        this.investors = new ArrayList<>();
    }

    public void attach(Investor investor) {
        investors.add(investor);
    }

    public void detach(Investor investor) {
        investors.remove(investor);
    }

    public void setPrice(double price) {
        this.price = price;
        notifyInvestors();
    }

    private void notifyInvestors() {
        for (Investor investor : investors) {
            investor.update(this);
        }
    }

    public double getPrice() {
        return price;
    }

    public String getSymbol() {
        return symbol;
    }
}