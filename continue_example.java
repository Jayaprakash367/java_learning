import java.util.Scanner;
public class continue_example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers (even numbers will be skipped, enter 0 to stop): ");
        while (true) {
            int number = sc.nextInt();
            if (number == 0) {
                break;
            }
            if (number % 2 == 0) {
                continue;
            }
            System.out.println("You entered an odd number: " + number);
        }
        sc.close();
    }
}
