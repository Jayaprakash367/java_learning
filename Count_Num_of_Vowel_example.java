package SCANNER;

import java.util.Scanner;

public class Count_Num_of_Vowel_example {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a string: ");
	String str=sc.nextLine();
	int vowelCount = 0;		
	for (int i = 0; i < str.length(); i++) {
		char ch = str.charAt(i);
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
			ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
			vowelCount++;
		}
        System.out.println("Number of vowels in the given string: " + vowelCount);
	    sc.close();

	}

}
}	