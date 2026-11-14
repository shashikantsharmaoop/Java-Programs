abstract class Payment {

    String customerName;

    Payment(String customerName) {
        this.customerName = customerName;
    }

    void printReceipt() {
        System.out.println("Customer Name: " + customerName);
    }

    abstract void pay();
}

// First Child Class
class CashPayment extends Payment {

    CashPayment(String name) {
        super(name);
    }

    void pay() {
        System.out.println("Payment Method: Cash");
    }
}

// Second Child Class
class CardPayment extends Payment {

    CardPayment(String name) {
        super(name);
    }

    void pay() {
        System.out.println("Payment Method: Credit Card");
    }
}

// Third Child Class
class UpiPayment extends Payment {

    UpiPayment(String name) {
        super(name);
    }

    void pay() {
        System.out.println("Payment Method: UPI");
    }
}

// Main Class
public class PaymentSystem {
    public static void main(String[] args) {

        Payment[] payments = {
            new CashPayment("Ravi"),
            new CardPayment("Amit"),
            new UpiPayment("Rahul")
        };

        for (int i = 0; i < payments.length; i++) {

            payments[i].printReceipt();
            payments[i].pay();

            System.out.println("-------------------");
        }
    }
}