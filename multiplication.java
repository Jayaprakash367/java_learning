import java.util.Scanner;
public class multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to display its multiplication table: ");
        int number = sc.nextInt();
        System.out.println("Multiplication table of " + number + ":");
        for (int i = 1; i <= 16; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        sc.close();
    }
}