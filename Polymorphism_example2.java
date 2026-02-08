package OOPs_Concept;
import java.util.Scanner;
public class Polymorphism_example2 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the value of A :");
		int a=scanner.nextInt();
		System.out.println("Enter the value of b :");
		int b=scanner.nextInt();
		System.out.println("The addition of a + b is :"+add(a,b));
		System.out.println("The subtraction of a-b is :"+sub(a,b));
		System.out.println("The Multiplication of a*b is :"+mul(a,b));
		System.out.println("The Divide of a & b is :"+div(a,b));
        System.out.println("The Modules of a & b is :"+Mod(a,b));
	}
	public static int add(int c, int d) {
		return c+d;
	}
    public static int sub(int e, int f) {
    	return e-f;
    }
    public static int mul(int num1,int num2) {
    	return num1*num2;
    }
    public static int div(int num3,int num4) {
    	return num3/num4;
    }
    public static int Mod(int num5,int num6) {
    	return num5%num6;
}
}
