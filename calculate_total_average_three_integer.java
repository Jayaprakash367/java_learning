import java.util.Scanner;
public class calculate_total_average_three_integer {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int num1=scan.nextInt();
        System.out.print("Enter second integer: ");
        int num2=scan.nextInt();    
        System.out.print("Enter third integer: ");
        int num3=scan.nextInt();
        int total=num1+num2+num3;
        double average=total/3.0;
        System.out.println("Total of three integer is: "+total);
        System.out.println("Average of three integer is: "+average);
        scan.close();
        
    }
}
