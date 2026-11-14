import java.util.Scanner;

public class NameInitials {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String firstName, lastName;

        System.out.print("Enter first name: ");
        firstName = sc.nextLine();

        System.out.print("Enter last name: ");
        lastName = sc.nextLine();

        System.out.println("Full Name = " + firstName + " " + lastName);

        System.out.println("Initials = " +
                firstName.charAt(0) + "." +
                lastName.charAt(0) + ".");

        sc.close();
    }
}
