import java.util.Scanner;

public class TotalBill {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double price;
        int quantity;

        System.out.print("Enter item price: ");
        price = sc.nextDouble();

        System.out.print("Enter quantity: ");
        quantity = sc.nextInt();

        double totalBill = price * quantity;

        System.out.printf("Total Bill = %.2f%n", totalBill);

        sc.close();
    }
}