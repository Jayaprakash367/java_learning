package day7.day8;

//--------------Using the array to reverse the element--------------------//

import java.util.Scanner;
public class reverse_array {

    static void reverse(int [] num){
        int l=0;
        int r=num.length-1;
        while(l<r){
               int temp=num[l];
               num[l]=num[r];
               num[r]=temp;
               l++;r--;
        
        }
        System.out.print("The reverse array is ");
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }

    public static void main(String[] args) {
    Scanner Sc=new Scanner(System.in);
    System.out.println("Enter the size of array");
    int num=Sc.nextInt();
    int [] size=new int[num];
    System.out.println("Enter the number  :");
    for(int i=0;i<num;i++){
        size[i]=Sc.nextInt();
    }
     reverse(size);
     Sc.close();
}
}