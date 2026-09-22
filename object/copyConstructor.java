package object;

class copy{
    public static void main(String[] args) {
        copyConstructor s1= new copyConstructor("Rahul");
        copyConstructor s2=  new copyConstructor(s1);
        System.out.println(s1.name);
        System.out.println(s2.name);
    }
}
public class copyConstructor {
    String name;
    copyConstructor(String name){
        System.out.println("The object is created ");
        this.name=name;
    }
    copyConstructor(copyConstructor obj){
        this.name=obj.name;
    }
}
