package Thread;

class msg extends Thread{
    public void  run(){
        for(int i=1;i<=5;i++){
            System.out.println("Hello "+Thread.currentThread().getName());
        }
    }
} 
class Student extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Student "+Thread.currentThread().getName());
        }
    }
}
public class Example3 {
    public static void main(String[] args) {
        
        msg m=new msg();
        Student s=new Student();
        m.start();
        s.start();
        m.setName("Arun");
        s.setName("Student");
        System.out.println("Student data ");
    }
}
