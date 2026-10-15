
import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius * 9.0 / 5.0) + 32;

        System.out.printf("Fahrenheit: %.2f%n", fahrenheit);

        System.out.print("Enter temperature in Fahrenheit: ");
        double f = sc.nextDouble();

        double c = (f - 32) * 5.0 / 9.0;

        System.out.printf("Celsius: %.2f%n", c);

        sc.close();
    }
}
