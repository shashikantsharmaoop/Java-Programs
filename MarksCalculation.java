import java.util.Scanner;

public class MarksCalculation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int marks1, marks2, marks3;

        System.out.print("Enter marks of Subject 1: ");
        marks1 = sc.nextInt();

        System.out.print("Enter marks of Subject 2: ");
        marks2 = sc.nextInt();

        System.out.print("Enter marks of Subject 3: ");
        marks3 = sc.nextInt();

        int total = marks1 + marks2 + marks3;

        double average = total / 3.0;

        System.out.println("Total Marks = " + total);
        System.out.printf("Average Marks = %.2f%n", average);

        sc.close();
    }
}