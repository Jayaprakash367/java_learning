import java.util.Scanner;
public class break_example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers (enter 0 to stop): ");
        while (true) {
            int number = sc.nextInt();
            if (number == 0) {
                break;
            }
            System.out.println("You entered: " + number);
        }
        sc.close();
    }
    
}
