// palindrome transformation count........
import java.util.*;
public class Example5 {
    public static void palindrome(int num) {8
        int count=0;
        while(num!=0){
            int temp=num;
            int rev = 0;
        while (temp != 0) {
            int dig = temp % 10;
            rev = rev * 10 + dig;
            temp /= 10;
        }
        if(rev==num){ 
            System.out.println(num);
            System.out.println(count);
            break;
        }
        num=num+rev;
        count++;
    }  
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        palindrome(num);
        sc.close();
    }
}

