package day10;

import java.util.Scanner;

public class reverse_example2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the String :");
        String str=in.nextLine();
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        System.out.println("reverse String :"+rev);
        in.close();
    }
}
