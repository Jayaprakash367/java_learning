package day5;
// withut return type without argument
import java.util.Scanner;

public class method3 {
        public void addvalue(int a,int b){
        int sum=a+b;
        System.out.println("the sum of a+b:"+sum);
    }
    public static void main (String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number:");
        int a=in.nextInt();
         System.out.println("Enter the number:");
        int b=in.nextInt();
        method2 obj=new method2();
        System.out.print(obj.addvalue(a, b));
    }
}
