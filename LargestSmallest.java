import java.util.Scanner;

public class LargestSmallest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Enter how many numbers: ");
        n = sc.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter " + n + " numbers:");

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        int largest = numbers[0];
        int smallest = numbers[0];

        for (int i = 1; i < n; i++) {

            if (numbers[i] > largest) {
                largest = numbers[i];
            }

            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        System.out.println("Largest Number = " + largest);
        System.out.println("Smallest Number = " + smallest);

        sc.close();
    }
}
