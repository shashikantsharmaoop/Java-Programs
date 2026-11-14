import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double celsius, fahrenheit;

        System.out.print("Enter temperature in Celsius: ");
        celsius = sc.nextDouble();

        fahrenheit = (celsius * 9 / 5) + 32;

        System.out.printf("Temperature in Fahrenheit = %.2f%n", fahrenheit);

        sc.close();
    }
}