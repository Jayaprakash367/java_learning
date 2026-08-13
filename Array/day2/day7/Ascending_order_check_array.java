package day7;

import java.util.Scanner;

//--------check if an array sorted in ascending order------//
public class Ascending_order_check_array {

    static void ascending(int[] num1){
        int asc=num1[0];
        for(int i=1;i<num1.length;i++){

        }
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=in.nextInt();
        int []num1=new int[num];
        for(int i=0;i<num1.length;i++){
            num1[i]=in.nextInt();
        }
        ascending(num1);
        in.close();
    }
}
