package Ascii_program;

public class Lowercase_Ascii_value_a_to_z {

	public static void main(String[] args) {
		Ascii();

	}
    public static void Ascii() {
    	System.out.println("The ascii Value of a to z is :");
    	for(int i=97;i<=122;i++) {
    		System.out.println("Ascii number "+(int)i +" Character " +(char)i);
    	}
    }
}
