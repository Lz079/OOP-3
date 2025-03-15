// Base class
class Payment {
    String payerName;
    double amount;

    public Payment(String payerName, double amount) {
        this.payerName = payerName;
        this.amount = amount;
    }

    public void processPayment() {
        System.out.println("Processing payment of " + amount + " from " + payerName);
    }
}

// Subclass
class SubscriptionPayment extends Payment {
    String subscriptionType;

    public SubscriptionPayment(String payerName, double amount, String subscriptionType) {
        super(payerName, amount); // Call to the superclass constructor
        this.subscriptionType = subscriptionType;
    }

    @Override
    public void processPayment() {
        super.processPayment(); // Call to the superclass method
        System.out.println("This is a " + subscriptionType + " subscription payment.");
    }
}

// Main class to test
public class App {
    public static void main(String[] args) {
        SubscriptionPayment sp = new SubscriptionPayment("John Doe", 29.99, "Monthly");
        sp.processPayment();
    }
}