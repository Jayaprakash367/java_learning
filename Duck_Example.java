package OOPs_Concept;
import java.util.Scanner;
public class Duck_Example {

	public static void main(String[] args) {
	   Scanner Sc= new Scanner(System.in);
	   System.out.print("Enter the Number :");
	   int num=Sc.nextInt();
	   
	   
	   boolean Zero=false;
	   while(num!=0) {
		    if(num%10==0 && num/10!=0) {
		    	
		    	Zero=true;
		    	break;
		    }num/=10;
	   
	   }
	   if(Zero) {
		   System.out.println("This is Duck Number");
	   }
	   else {
		   System.out.println("This is not Duck Numaber");
	   }

	   
	}
}
