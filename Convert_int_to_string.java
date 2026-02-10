package Type_Conversion;
import java.util.Scanner;
public class Convert_int_to_string {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int input=sc.nextInt();
		string(input);
		
	}
	public static void string(int number) {
		String str=String.valueOf(number);
		System.out.println("The integer to string is:"+str);
		
	}

}
