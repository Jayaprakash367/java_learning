package day7.day8;

import java.util.Scanner;

public class find_sum_array {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter the size of array");
          int size=sc.nextInt();
          int [] num1=new int[size];
          System.out.println("Enter the elements of array");
        for(int i=0;i<num1.length;i++){
            num1[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<=num1.length;i++){
            sum=sum+i;
        }
        System.out.println("Sum of array element is :"+sum);
        sc.close();
    }
}
