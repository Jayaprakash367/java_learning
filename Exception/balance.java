package Exception;
import java.util.*;

public class balance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the money withdraw");
        int with=sc.nextInt();
        int balance=10000; 
      try{
        if (with>balance) {
            throw new InsufficientBalanceException("Withdraw amount less than balance "+"current balance :"+balance);
        }
        else{
            System.out.println("Successful withdraw ");
            System.out.println("current balance :"+(balance-with));
        }
      }catch(Exception e){
        System.out.println(e.getMessage());
      } 
    }
}
class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(String msg){
        super(msg);
    }
}
