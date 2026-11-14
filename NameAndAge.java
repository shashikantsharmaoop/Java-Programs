import java.util.Scanner;

public class NameAndAge {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name;
        int age;

        System.out.print("Enter your name: ");
        name = sc.nextLine();

        System.out.print("Enter your age: ");
        age = sc.nextInt();

        System.out.println("Hello " + name + ", you are " + age + " years old.");

        sc.close();
    }
}
