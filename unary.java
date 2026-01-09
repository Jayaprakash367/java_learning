public class unary {
    public static void main(String[] args) {
        int a = 5;
        System.out.println("Original value of a: " + a);

        int unaryPlus = +a;
        System.out.println("Using unary plus operator: " + unaryPlus);

        int unaryMinus = -a;
        System.out.println("Using unary minus operator: " + unaryMinus);

        a++;
        System.out.println("After incrementing, value of a: " + a);

        a--;
        System.out.println("After decrementing, value of a: " + a);
    }
}
