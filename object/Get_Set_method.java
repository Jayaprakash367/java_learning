package object;

public class Get_Set_method {
    private String name;
    private long accountNumber;
    private double balance;
    Get_Set_method(String name,long accountNumber,double balance){
        this.name=name;
        this.accountNumber=accountNumber;
        this.balance=balance;
    
    }
    public void setB(double B){
        if(B<0){
            System.out.println("Balance cannot be negative");
            return;
        } else {
            this.balance=B;
        }
    }
    public double getB(){
        return balance;
    }

}
 class balance {
      public static void main(String[] args) {
        bankapp b1=new bankapp("Rahul",123456789,10000);
       System.out.println(b1.getB());
        double depositAmount=5000;
        b1.setB(depositAmount);
        System.out.println(b1.getB());
}
}

