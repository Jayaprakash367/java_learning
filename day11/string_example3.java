package day11;

import java.util.Scanner;

public class string_example3 {
       public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the String :");
        String rev=in.next();
        String reverse="";
        for(int i=rev.length()-1;i>=0;i--){
            reverse=reverse+rev.charAt(i);

        }
        System.out.println(reverse);
        in.close();
       }
}
