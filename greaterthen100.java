import java.util.Scanner;
public class greaterthen100 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.print("Enter a number: ");
         int number = scan.nextInt();
         if (number > 100) {
              System.out.println(number + " is greater than 100.");
            } else {
              System.out.println(number + " is not greater than 100.");
            }
       scan.close();  

    }
}