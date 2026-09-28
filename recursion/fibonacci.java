package recursion;

class sub{
public static int fib(int n){
        if (n<=1)
            return n;
        return fib(n-1)+fib(n-2);
    }
}
public class fibonacci {
    public static void main(String[] args) {
        sub num = new sub();
        System.out.println(num.fib(5));
    }
}
