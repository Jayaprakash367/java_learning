package Thread;

class counter {
    int count=0;
    synchronized void increament(){
    count++;
    }
}
class mythread extends  Thread{
    counter c;
    mythread(counter c){
    this.c=c;
    }
    public void run(){
        for(int i=0; i<1000; i++){
            c.increament();
        }
    }
}

public class Example4 {
    public static void main(String[] args) {
        counter c=new counter();
        mythread t1=new mythread(c);
        mythread t2=new mythread(c);
        t1.start();
        t2.start();
    try{
        t1.join();
        t2.join();

    }catch(InterruptedException e){
            System.out.println(e.getMessage());
    }
        System.out.println("Final Amount :"+c.count);
    }
}
