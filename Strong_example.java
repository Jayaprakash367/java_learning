package Core_java_program;

import java.util.Scanner;

public class Strong_example {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int num=sc.nextInt();
		int sum=0;
		int temp=num;
		while(num>0) {
			int rem=num%10;
			int fact=1;
			for(int i=1;i<=rem;i++) {
				fact*=i;
			}
			sum=sum+fact;
			num=num/10;
		}
		if(sum==temp) {
			System.out.println("Strong number:"+sum);
		}
		else {
			System.out.println("Not a strong number:  "+sum);
		}

	}

}
