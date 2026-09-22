package object;

class overload{
    public static void main(String[] args) {
        constructorOverloading  s= new constructorOverloading ("Null");
        constructorOverloading  s1= new constructorOverloading ("Rahul",28);
        System.out.println(s.name);
        System.out.println(s1.name);
        System.out.println(s1.age);
    }
}

public class constructorOverloading {
    String name;
    int age;
   constructorOverloading (String name){
        System.out.println("The object is created ");
        this.name=name;
    } 
    constructorOverloading(String name, int age){
        this.name=name;
        this.age=age;
    }  
}
