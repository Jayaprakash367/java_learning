package day5;
//........ with return type with argument.......
import java.util.Scanner;
public class method2 {
    public int addvalue(int a,int b){
        int sum=a+b;
        return sum;
    }
    public static void main (String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number:");
        int a=in.nextInt();
         System.out.println("Enter the number:");
        int b=in.nextInt();
        method2 obj=new method2();
        int res=obj.addvalue(a,b);
        System.out.println(res);
        in.close();
    }
}
