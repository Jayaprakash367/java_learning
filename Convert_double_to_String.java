package Type_Conversion;
import java.util.Scanner;

public class Convert_double_to_String {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
	    double input=sc.nextInt();
        string(input);
	}
	public static void string(double number) {
		  String num=Double.toString(number);
		System.out.println("The String to integer is:"+num);
		
	}
}
