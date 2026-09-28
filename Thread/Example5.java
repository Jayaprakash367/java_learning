package Thread;

class Whapp extends Thread {

    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println("Updating Whatsapp - " + Thread.currentThread().getName());
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}

public class Example5 {

    public static void main(String[] args) {

        ThreadGroup tg = new ThreadGroup("Whatsapp");

        Whapp wh1 = new Whapp();
        Whapp wh2 = new Whapp();
        Whapp wh3 = new Whapp();

        Thread t1 = new Thread(tg, wh1, "Thread1");
        Thread t2 = new Thread(tg, wh2, "Thread2");
        Thread t3 = new Thread(tg, wh3, "Thread3");

        t1.start();
        t2.start();
        t3.start();
        tg.list();
        System.out.println("Thread Group Name : " + tg.getName());
        System.out.println("Active Threads in Group : " + tg.activeCount());
        System.out.println("Thread Group Parent : " + tg.getParent().getName());
        System.out.println("Thread Group Max Priority : " + tg.getMaxPriority());
        System.out.println("Thread Group is Daemon : " + tg.isDaemon());
        
    }
}