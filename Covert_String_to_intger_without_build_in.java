package Type_Conversion;

import java.util.Scanner;

public class Covert_String_to_intger_without_build_in {
	public static void main(String[]arg) {
		
		str.method2();
		}
		}
		class str{
			static void method2() {
				Scanner sc=new Scanner(System.in);
				System.out.println("enter a number:");
				String num=sc.next();
				int len=num.length();
				int result=0;
				for(int i=0;i<len;i++) {
					char temp=num.charAt(i);
					int value=temp-48;
					result=result*10+value;
					
				}System.out.print("The covert String to Integer:"+result);
			}
			}

