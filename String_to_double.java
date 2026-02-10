package Type_Conversion;
import java.util.Scanner;
public class String_to_double {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
	    String input=sc.next();
        Double(input);

	}
	public static void Double(String number) {
		  double num=Double.parseDouble(number);
		System.out.println("The String to integer is:"+num);
		
	}
}
