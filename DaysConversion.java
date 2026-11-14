import java.util.Scanner;

public class DaysConversion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int days;

        System.out.print("Enter total number of days: ");
        days = sc.nextInt();

        int years = days / 365;
        int remainingDays = days % 365;

        
        int weeks = remainingDays / 7;
        int remaining = remainingDays % 7;

        System.out.println("Years = " + years);
        System.out.println("Weeks = " + weeks);
        System.out.println("Remaining Days = " + remaining);

        sc.close();
    }
}