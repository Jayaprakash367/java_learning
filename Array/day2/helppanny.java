import java.util.Scanner;

public class helppanny {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter the num");
        int a=Sc.nextInt();
        System.out.println("Enter the num");
        int b=Sc.nextInt();
        for(int i=1;i<=a;i++){
            System.out.println(+i+ " * " +b+ "="+i*b);
        }
        Sc.close();
    }
}
