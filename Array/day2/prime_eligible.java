import java.util.Scanner;

public class prime_eligible {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the roll number");
        int num=in.nextInt();
        boolean isprime=true;
        for(int i=2;i<=num-1;i++){
            if (num%i==0) {
               isprime=false;
            }
        }
            if (isprime=true) {
                System.out.println("you are eligible");
            }else{
                System.out.println("You are not eligible:");
            }
            in.close();
        }
    }