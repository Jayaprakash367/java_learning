package Thread;
class whatsapp extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Whatsapp updated");
        }
    }
}
class insta extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Insta updated ");
        }
    }
}

public class Example2 {
    public static void main(String[] args) {
        whatsapp w=new whatsapp();
        insta i=new insta();
        w.start();
        i.start();
        System.out.println("Thank you");
    }
}
