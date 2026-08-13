package day7;

import java.util.Scanner;

public class max_min_array_example { 
    //--------------finding the minimum value-----------//

    static void findmin(int[] num1){
    int min=num1[0];
    for(int i=1;i<num1.length;i++){
        if(num1[i]<min){
            min=num1[i];
        }
    }
     System.out.println("--------------------");
    System.out.println("Minimum values is :"+min);
     System.out.println("--------------------");
    }
     //------------finding the maximum value---------//
    static void findmax(int[] num1){
        int max=num1[0];
        for(int i=1;i<num1.length;i++){
            if(num1[i]>max){
                max=num1[i];
            }
        }
        System.out.println("--------------------");
        System.out.println("Maximum values is :"+max);
    }
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the number :");
        int num=in.nextInt();

        //-------using the array to get the variable--------//

        int [] num1=new int[num];
        for(int i=0;i<num1.length;i++){
            num1[i]=in.nextInt();
        }
        //------printing the array output----------//
        findmax(num1);
        findmin(num1);
        in.close();
    }
}
