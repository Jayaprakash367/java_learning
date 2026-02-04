package Core_java_program;
import java.util.Scanner;
public class Harshad_num_example {

	public static void main(String[] args) {
		Scanner Sc=new Scanner (System.in);
		System.out.println("Enter the Number:");
		int num=Sc.nextInt();
		int temp=num;
		int sum=0;
		while(temp>0) {
			int digit=temp%10;
			sum+=digit;
			temp/=10;
			
		}
		if(num%sum==0) {
         System.out.println("This  is Harshad Number");
		}else {
		 System.out.println("This is not Harshad Number");
		}
}
}
