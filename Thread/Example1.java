package Thread;

class Whatsapp extends Thread{
    public void run(){
        for(int i=0; i<10;i++){
            System.out.println("Updating Whatsapp");
        }
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
    } 
}
class Insta extends Thread{
    public void run(){
        for(int i=0; i<10;i++){
            System.out.println("Updating Insta");
        }
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}
public class Example1 {
    public static void main(String[] args) {
        Whatsapp wh=new Whatsapp();
        Insta in=new Insta();
        wh.start();
        in.start();
        try{
        wh.join();
        in.join();
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
        System.out.println("thank you");
    }
}
