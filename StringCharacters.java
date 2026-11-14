import java.util.Scanner;

public class StringCharacters {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str;

        System.out.print("Enter a string: ");
        str = sc.nextLine();

        System.out.println("First Character = " + str.charAt(0));
        System.out.println("Last Character = " + str.charAt(str.length() - 1));
        System.out.println("Character at Position 3 = " + str.charAt(2));

        sc.close();
    }
}