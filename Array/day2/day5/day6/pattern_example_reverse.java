package day5.day6;

import java.util.Scanner;

public class pattern_example_reverse {
     
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the num");
        int num=in.nextInt();
        for(int i=num;i>=1;i--){
    
            for(int j=i;j>=1;j--){
                System.out.print("*"+" ");
            }
                System.out.println();
        }
        in.close();
    }
}
