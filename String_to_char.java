package Type_Conversion;

import java.util.Scanner;

public class String_to_char {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Character:");
	    String input=sc.next();
		Character(input);
	}
	public static void Character(String string) {
		char str=string.charAt(0);
		System.out.println("The character to String :"+str);
		
	}

	

}
