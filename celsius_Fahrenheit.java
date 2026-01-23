
import java.util.Scanner;

public class celsius_Fahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextFloat();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.printf("Temperature in Fahrenheit: %.2f%n", fahrenheit);
        scanner.close();
    }
}