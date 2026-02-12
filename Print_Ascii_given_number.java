package Ascii_program;
import java.util.Scanner;

public class Print_Ascii_given_number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character or string: ");
        String input = sc.next();
        ascii(input);
        
        sc.close();
    }

    public static void ascii(String input) {
        System.out.println("\nASCII values:");
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            int asciiValue = (int) ch;
            System.out.println(   + asciiValue);
        }
    }
}