import processor.PaymentProcessor;
import strategy.BitcoinPaymentStrategy;
import strategy.CreditCardPaymentStrategy;
import strategy.PayPalPaymentStrategy;

public class App {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        processor.setPaymentStrategy(new CreditCardPaymentStrategy("1234567890123456", "12/24", "123"));
        processor.processPayment(100.0);

        processor.setPaymentStrategy(new PayPalPaymentStrategy("email@email.com", "senha123"));
        processor.processPayment(50.0);

        processor.setPaymentStrategy(new BitcoinPaymentStrategy("1BvBMSEYstWetqTFn5Au4m4GFg7xJaNVN2"));
        processor.processPayment(200.0);
    }
}
