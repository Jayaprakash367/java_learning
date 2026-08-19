
public class Polymorphism_Example4 {

	public static void main(String[] args) {
      n obj=new n();
        n.Example5();
	}
}
class classm{
	public static void Example1() {
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println("A + B is :"+sum);
		System.out.println(floating(a,b));
		
	}
	public static float  floating(int a, int b) {
		return a+b;
	}
}
class n extends classm{
	public static void Example5() {
		int c=80;
		int d=90;
		System.out.println("The value of C:"+c);
		System.out.println("The value of C:"+d);
	}
}


