public class positive_even {
    public static void main(String[] args) {
        int number =23;

        if (number > 0) {
            if (number % 2 == 0) {
                System.out.println(number + " is a positive even number.");
            } else {
                System.out.println(number + " is a positive odd number.");
            }
        } else {
            System.out.println(number + " is not a positive number.");
        }
    }
}
