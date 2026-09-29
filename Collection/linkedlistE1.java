package Collection;

import java.util.LinkedList;

public class linkedlistE1 {
     public static void main(String[] args) {
       LinkedList<String> list=new LinkedList<>();
       list.add("Bob");
       list.add("Alice");
       list.add("David");
       list.add("Elisa");
       System.out.println(list.getLast());
     }
}
