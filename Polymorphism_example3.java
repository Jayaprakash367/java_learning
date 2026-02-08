package OOPs_Concept;

public class Polymorphism_example3 {

	public static void main(String[] args) {
		int a,b,c;
		a=10;
	    b=20;
	    c=30;
		System.out.println(example(a,b));
		System.out.println(example(a,b,c));
	}
	public static int example(int num1, int num2) {
		return num1+num2;
	}
	public static int example(int a,int b, int c) {
		return a+b+c;
	}
}
