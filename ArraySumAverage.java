import java.util.Scanner;

public class ArraySumAverage {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, sum = 0;

        System.out.print("Enter how many numbers: ");
        n = sc.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter " + n + " numbers:");

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
            sum = sum + numbers[i];
        }

        double average = (double) sum / n;

        System.out.println("Sum = " + sum);
        System.out.printf("Average = %.2f%n", average);

        sc.close();
    }
}