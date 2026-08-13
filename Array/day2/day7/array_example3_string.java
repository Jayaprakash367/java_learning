package day7;

import java.util.Scanner;

// Array to use the string to print the name 
public class array_example3_string {

    //---
     static void printarray(String[] names) {
        //----------print an array------ 
          System.out.println("names :");
          for(int i=0; i<names.length;i++){
            System.out.println(names[i]+"");
        }
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Size of array :");
        int size=in.nextInt();
        //...........Declaring array............
        String names[]=new String[size];
        System.out.println("Enter the Array Elements");
        //......user input for array......
        for(int i=0;i<size;i++){
            names[i]=in.next();
        }
        // calling method to print array
        printarray(names);
        in.close();
    }
}
