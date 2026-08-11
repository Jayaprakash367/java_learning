package day5;


public class method_reverse {
    public int reversenum(int n){
        int rev=0;
        while(rev>0){
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }return rev;
    }
    public static void main(String[] args) {
        method_reverse obj=new method_reverse();
        System.out.println(obj.reversenum(1234));

    }
}
