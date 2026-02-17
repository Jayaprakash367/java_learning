package Ascii_program;

public class Print_Ascii_Value_A_to_Z {

	public static void main(String[] args) {
		Ascii();

	}
public static void Ascii() {
	System.out.println("The Ascii Value of A to Z :");
	for(int i=65;i<=90;i++) {
		System.out.println("'"+(int)i+ "'charcter'" +(char)i +"'");
	}
	
}
}
