package object.Abstraction;

abstract class payment {
   double amount;

   payment(double amount) {
      this.amount = amount;
   }

   abstract void pay();
}

class Creditcard extends payment {
   Creditcard(double amount) {
      super(amount);
   }

   void pay() {
      System.out.println("creditcard:" + amount);
   }
}

class Debitcard extends payment {
   Debitcard(double amount) {
      super(amount);
   }

   void pay() {
      System.out.println("debitcard:" + amount);
   }
}

public class Main {
   public static void main(String[] args) {
      payment p1 = new Creditcard(100);
      p1.pay();

      payment p2 = new Debitcard(200);
      p2.pay();
   }

}
