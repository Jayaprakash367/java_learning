public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // Change this value to compute a different Fibonacci number
        int first = 0, second = 1, next;

        System.out.print("Fibonacci Series up to " + n + ": ");

        for (int i = 0; i < n; i++) {
            if (i <= 1) {
                next = i;
            } else {
                next = first + second;
                first = second;
                second = next;
            }
            System.out.print(next + " ");
        }
    }
}





