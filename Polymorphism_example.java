package OOPs_Concept;

public class Polymorphism_example {

	public static void main(String[] args) {
		System.out.println(add());

	}
	public static int add() {
		int a=10;
		System.out.println(floating());
		return a;
	    
}
   public static float floating() {
	   float b=30;
	   System.out.println(String_example());
	   return b;
   }
   public static String String_example() {
	   String c="Welcome";
	   System.out.println(double_example());
	   return c;
   }
   public static double double_example() {
	   double d=4000;
	   return d;
   }
}
