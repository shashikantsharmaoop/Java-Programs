import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int sum = a + b;
        int difference = a - b;
        int product = a * b;

        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + difference);
        System.out.println("Product = " + product);

        if (b != 0) {
            int quotient = a / b;
            System.out.println("Quotient = " + quotient);
        } else {
            System.out.println("Division by zero is not possible.");
        }

        sc.close();
    }
}