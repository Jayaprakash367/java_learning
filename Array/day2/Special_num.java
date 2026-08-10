import java.util.Scanner;

public class Special_num {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the starting number ");
        int num1=in.nextInt();
        System.out.println("Enter the end of num");
        int num2=in.nextInt();
        int result;
        for(int i=num1; i<=num2;i++){
            int dig1=i%10;
            int dig2=i/10;
            int sum=dig1+dig2;
            int product=dig1*dig2;
            result=sum+product;
            if (result==i) {
                System.out.println("special number is "+i);
            }
        }
        in.close();
        }

        }

