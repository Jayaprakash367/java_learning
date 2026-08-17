package day7.day8;

import java.util.Scanner;

public class find_sum_array_method2 {

     static int findsum(int[] num){
        int sum=0;
        for(int i=0;i<=num.length;i++){
            sum=sum+i;
        } return sum;
     }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int num=in.nextInt();
        int [] size=new int[num];
        System.out.println("Enter the element :");
        for(int i=0;i<num;i++){
            size[i]=in.nextInt();
        }
        int result=findsum(size);
        System.out.println(result);
        in.close();
      
    }
}
