package day5.day6;

import java.util.Scanner;

public class pattern_example1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the num");
        int num=in.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
                System.out.println();
        }
        in.close();
    }
}
