package object.Inheritance;

 class Animal{
    protected void makeSound(){
        System.out.println("Animal makes a sound");
    }
    
}
class Dog extends Animal{

    protected void eat(){
        System.out.println("Dog eat");
    }
}
class Cat extends Dog{
    protected void eat(){
        System.out.println("");
    }
}

class main{
    public static void main(String[] args) {
        Dog d=new Dog();
        d.makeSound();
        d.eat();
    }
}