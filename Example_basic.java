import java.util.Scanner;

public class Example_basic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int num1 = sc.nextInt();
       
        int fibonacci = 0;

        int a = 0, b = 1, c;

        for (int i = 1; i <= num1; i++) {
            c = a + b;
            a = b;
            b = c;
            fibonacci = c;
            System.out.print(fibonacci + " ");
        }
        

        sc.close();
    }
}