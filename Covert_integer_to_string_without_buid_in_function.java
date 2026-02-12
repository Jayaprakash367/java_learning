package Type_Conversion;

import java.util.Scanner;

public class Covert_integer_to_string_without_buid_in_function {
	public static void main(String[]arg) {
		
		convert.method2();
		}
	}
	class convert{
		/*static void Integer_str() {
			
			//System.out.println(String.valueOf(num));
		}*/
		static void method2(){
			Scanner sc=new Scanner(System.in);
			System.out.println("enter a value:");
			int num=sc.nextInt();
			int temp=num;
			int count=0;
			
			String result="";
			while(temp!=0) {
				int digit=temp%10;
				count++;
				temp/=10;
			}
			for(int i=0;i<count;i++) {
				 int digit=num%10;
				 char ch=(char)(digit+'0');
				 result=ch+result;
				 num/=10;
			}
			System.out.println("The Integer to String:"+result);
			
		}
		}
