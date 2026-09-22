package object;

class main{
    public static void main(String[] args) {
        constructorParameterlized s= new constructorParameterlized("Null");
        constructorParameterlized s1= new constructorParameterlized("Rahul");
        System.out.println(s.name);
        System.out.println(s1.name);
    }
}
public class constructorParameterlized {
    String name;
    constructorParameterlized(String name){
     
        this.name=name;
    }
}