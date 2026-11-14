import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str1, str2;

        System.out.print("Enter first string: ");
        str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        str2 = sc.nextLine();

        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("Both strings are equal.");
        } else {
            System.out.println("Both strings are not equal.");
        }

        sc.close();
    }
}