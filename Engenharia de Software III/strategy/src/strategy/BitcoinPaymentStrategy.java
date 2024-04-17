package strategy;

public class BitcoinPaymentStrategy implements PaymentStrategy {
    private String bitcoinAddress;

    public BitcoinPaymentStrategy(String bitcoinAddress) {
        this.bitcoinAddress = bitcoinAddress;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Pagando " + amount + " com Bitcoin");
    }
}