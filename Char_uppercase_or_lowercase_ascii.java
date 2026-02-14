package Ascii_program;
import java.util.Scanner;
public class Char_uppercase_or_lowercase_ascii {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the character:");
		String num1=sc.next();
		char character=num1.charAt(0);
		int num2=(int)character;
		if(num2>=65 && num2<=90) {
			System.out.println("this is Upper case:"+num2);
		}
		else if (num2>=97 && num2<=122) {
			System.out.println("This is lower Case:"+num2);
		}
		else {
			System.out.println("this is not  alphabet number:"+num2);
		}
	}

}
