package object;

public class constructorExample {
  String name;
  constructorExample(){
    System.out.println("The object is created ");
  }
}
 class Main{
    public static void main(String[] args) {
        constructorExample s=new constructorExample();
    }
 }