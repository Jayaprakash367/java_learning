package day7;
//.................. Array method 1 example ...........
import java.util.Scanner;
public class array_example1 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number :");
    int num=sc.nextInt();
    int []arr=new int[num];
    arr[0]=10;
    arr[1]=20;
    arr[2]=30;
    System.out.println(arr[0]);
    System.out.println(arr[1]); 
    System.out.println(arr[2]);
    System.out.println("----------------");
    System.out.println(+arr[0]+arr[1]);
    System.out.println("----------------");
    System.out.println(arr[2]-arr[1]);
    System.out.println("----------------");
    sc.close();
}

}
