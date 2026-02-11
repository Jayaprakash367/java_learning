package Ascii_program;
import java.util.Scanner;
public class Ascii_char {

	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the character:");
	  String input=sc.next();
	  Ascii(input);
	  sc.close();

	}
	public static void Ascii(String Asciichar) {
		char character=Asciichar.charAt(0);
		System.out.println(+character);
		
	}

}
