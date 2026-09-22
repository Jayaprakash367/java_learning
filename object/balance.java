package object;

class bankapp {
    String name;
    long accountNumber;
    double balance;
    bankapp(String name,long accountNumber,double balance){
        this.name=name;
        this.accountNumber=accountNumber;
        this.balance=balance;
    
    }
    public void deposit(double amount){

        balance+=amount;
    }
    public char[] getB() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getB'");
    }
    public void setB(double depositAmount) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setB'");
    }

}

public class balance {
      public static void main(String[] args) {
        bankapp b1=new bankapp("Rahul",123456789,10000);
        System.out.println("Name: " + b1.name);
        System.out.println("Account Number: " + b1.accountNumber);
        System.out.println("Balance: " + b1.balance);
        double depositAmount=5000;
        b1.deposit(depositAmount);
        System.out.println("After depositing " + depositAmount + ", new balance: " + b1.balance);
}
}