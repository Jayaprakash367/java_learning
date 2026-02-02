package Core_java_program;
import java.util.Scanner;
public class Automorphic_example {
	public static void main(String[] arg) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number:");
   int num=sc.nextInt();
   int num1=num;
   int sq=num1*num1;
   if(num%10==sq%10) {
	   System.out.println("This is automorphic number:"+sq);
   }
   else {
	   System.out.println("This is not automorphic number:"+sq);
   }
}
}