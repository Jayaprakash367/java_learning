package Core_java_program;
import java.util.Scanner;
public class Neon_Number {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number:");
	int num=sc.nextInt();
	int Square=num*num;
	int sum=0;
	while(Square>0) {
		sum+=Square%10;
		Square/=10;
	}
	if(sum==num) {
		System.out.println("Entered Number is Neon Number:"+sum);
	}
	else {
		System.out.println("Entered Number is Not Neon Number:"+sum);
	}

	}

}
