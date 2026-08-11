package day5;
//------- with return type and without argument example------
public class method {
    public int addvalue(){
        int a=5;
        int b=10;
        int sum=a+b;
        return sum;
    }
    public static void main(String[] args) {
        method obj=new method();
        int res=obj.addvalue();
        System.out.println(res);
    }
}
