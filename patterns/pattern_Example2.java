package Pattern_program;
import java.util.Scanner;

public class pattern_Example2 {

    public static void main(String[] args) {
        method();
    }
    
    public static void method() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the rows:");
        int num1 = sc.nextInt();
        System.out.println("Enter the size of the column:");
        int num2 = sc.nextInt();
        
        int rows = num1;
        int column = num2;
        
        for(int i = 0; i < rows - 1; i++) {
            System.out.println("*");
        }
        for(int j = 0; j < column; j++) {
            System.out.print("*");
        }
        System.out.println();
        
        sc.close();
    }
}