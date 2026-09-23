package object.polymorphism;

public class example {
     void exam(){
        System.out.println("Exam conduct");
     }
}

 class Engg extends example{
    @Override 
    void exam(){
        System.out.println("Example starts by 9");
    }
 }
 class Arts extends example{
    @Override 
    void exam(){
        System.out.println("Exam Start by 9.30");
    }
 }

 class Main{
    public static void main(String[] args) {
        example e1;
        e1=new Arts();
    }
 }
