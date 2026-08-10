import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner In= new Scanner(System.in);
        System.out.println("Enter the factorial number:");
        int n=In.nextInt();
        int fact=1;
        for(int i=2;i<=n;i++){
            fact=fact*i;
        }
        System.out.print("the factorial :"+fact);
        In.close();
    } 
}
