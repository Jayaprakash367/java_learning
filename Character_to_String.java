package Type_Conversion;
import java.util.Scanner;
public class Character_to_String {
	public static void main(String[]arg) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Character:");
		char character=sc.next().charAt(0);
		string(character);
	}
	public static void string(char string) {
		String str=Character.toString(string);
		System.out.println("The character to String :"+str);
		
	}
}
