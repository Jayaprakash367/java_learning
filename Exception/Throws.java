package Exception;

public class Throws {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        try{
            int c=a/b;
            System.out.println(c);
        }catch(Exception e){
            System.out.println("Error: Division by zero is not allowed.");
        }finally{
            System.out.println("This block is always executed.");
        }
    }
}
