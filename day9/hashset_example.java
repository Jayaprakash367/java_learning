package day9;
import java.util.HashSet;
import  java.util.Set;
public class hashset_example {
    public static void main(String[] args) {
        // syntax for the hashset ---/
        HashSet<Integer> set= new HashSet<>();
        set.add(5);
        set.add(15);
        set.add(20);
        set.add(25);
        set.add(150);
        set.add(6);
        System.out.println("original hashset :"+set);
        System.out.println("-----------------------------------");
        
        // It does not print repeat the same element // 
        set.add(15);
        System.out.println("After adding again 15 :"+set);
        System.out.println("-----------------------------------");

        // To check the element contains hashset or not 
        System.out.println("is 25 contains?"+set.contains(25));
        System.out.println("-----------------------------------");

        //removing element 
        set.remove(150);
        System.out.println("After remove the 150 :"+set);
         System.out.println("-----------------------------------");

        // to iterate over hashset
        System.out.println("Iteration the hashset :");
        for(int num:set){
            System.out.print(num+" ");
        }
        // Remove everything from Hashset
        set.clear();
    }
}
