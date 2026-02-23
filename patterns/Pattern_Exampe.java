package Pattern_program;

import java.util.Scanner;

public class Pattern_Exampe {
    public static void main(String[] args) {
        pattern.example1();
    }
}

class pattern {
    static void example1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the rows:");
        int num1 = sc.nextInt();
        System.out.println("Enter the size of the column:");
        int num2 = sc.nextInt();
        
        int i, j, rows = num1, column = num2;

        for (i = 1; i <= rows; i++) {
            for (j = 1; j <= column; j++) {
            	
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close(); 
    }
}   