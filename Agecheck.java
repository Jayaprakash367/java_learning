import java.util.Scanner;
class AgeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();

        if (age < 18) {
            System.out.println("You are a minor");
        } else if (age >= 18 && age < 21) {
            System.out.println("You are an adult");
            System.out.println("You are going to become an adult!");
        } else if (age >= 21 && age < 60) {
            System.out.println("You are an adult");
            System.out.println("You are going to get a job!");
        } else if (age >= 60 && age < 100) {
            System.out.println("You are going to retire!");
        } else {
            System.out.println("You are young");
        }

        sc.close();
    }
}