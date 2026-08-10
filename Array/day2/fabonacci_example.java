import java.util.Scanner;

public class fabonacci_example {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the num");
        int num=in.nextInt();
        int a=0;
        int b=1;
        System.out.print(+a+""+b+"");
        for(int i=2;i<num;i++){
             int c=a+b;
            System.out.print(c+"");
              a=b;
              b=c;
         
        }
    }
}
