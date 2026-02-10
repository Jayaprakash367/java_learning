package Type_Conversion;
import java.util.Scanner;
public class Convert_string_to_integer {

	public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				System.out.print("Enter the number:");
				String input=sc.next();
				Integer(input);
				sc.close();
			}
			public static void Integer(String number) {
				int num=Integer.valueOf(number);
				System.out.println("The String to integer is:"+num);
				
			}
			
	}

