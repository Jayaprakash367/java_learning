package Ascii_program;
import java.util.Scanner;
public class print_char_given_ascii_value {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Ascii Number :");
		int input=sc.nextInt();
		Ascii(input);
		sc.close();

	}
	public static void Ascii(int Asciivalue) {
		char character=(char) Asciivalue;
		System.out.println("Character of Ascii number:" + character);
	}

}
