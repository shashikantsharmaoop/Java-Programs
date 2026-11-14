// Interface
interface Notifier {
    void sendNotification();
}

// Outer Class
public class BankAccount {

    private double balance = 5000;

    // Inner Class
    class AccountDetails {

        void updateBalance(double amount) {
            balance = balance + amount;

            System.out.println("Updated Balance: " + balance);
        }

        void showBalance() {
            System.out.println("Current Balance: " + balance);
        }
    }

    // Static Nested Class
    static class Receipt {

        void printReceipt() {
            System.out.println("Bank Receipt Generated Successfully");
        }
    }

    // Method using Interface
    void notifyCustomer(Notifier notifier) {
        notifier.sendNotification();
    }

    // Main Method
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        // Creating Inner Class Object
        BankAccount.AccountDetails details =
                account.new AccountDetails();

        details.showBalance();
        details.updateBalance(2000);

        // Creating Static Nested Class Object
        BankAccount.Receipt receipt =
                new BankAccount.Receipt();

        receipt.printReceipt();

        // Creating Interface Object using Anonymous Class
        Notifier notification = new Notifier() {

            public void sendNotification() {
                System.out.println("Notification: Your account has been updated.");
            }
        };

        account.notifyCustomer(notification);
    }
}
