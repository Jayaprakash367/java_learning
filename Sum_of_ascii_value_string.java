package Ascii_program;
import java.util.Scanner;
public class Sum_of_ascii_value_string {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		System.out.print("Enter the String  :");
	     String input=sc.next();
		
		Ascii(input);
		sc.close();
	}
 public static void Ascii(String ascii) {
	  int sum=0;
	 for(int i=0;i<ascii.length();i++) {
		 char character=ascii.charAt(i);
		 int num=(int)character;
		 sum+=num;
			 
		 
	 }
	 System.out.println("The sum of ascii :"+sum);
 }
}
