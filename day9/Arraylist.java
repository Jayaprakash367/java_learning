package day9;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
public class Arraylist {
    public static void main(String[] args) {
        //Declare arraylist in string 
        ArrayList<String> list=new ArrayList<>();

        //add() -> to insert the element end of the arraylist //
        list.add("is");
        list.add("a");

        //sout add function is add the array in before the arraylast element print the sout print //
        System.out.println("add:"+list.add("very"));

        //addfirst() -> to insert the element in front of arraylist---//
        list.addFirst("He");

        //addlast() -> to ensure adding the element at end of the list //
        list.addLast("Good");
        list.addLast("boy");

        //set() -> To replace an element in a specific index position
        list.set(4, "Bad");
       
        //add(idx,element) -> insert an element a specific index
        list.add(2,"also");

        //to print the arraylist
        System.out.println("org list :"+list);

        // to find the Size of the arraylist
        System.out.println("Size :"+list.size());

        // get(idx) -> to retrive an element form list
        System.out.println("Second element  :"+list.get(1));

        // To print the array
        System.out.println(list);
        
        // retrive the all element using the loop
        System.out.println("---------------------------------");

        //for loop used to retrive the arraylist
        System.out.println("Using for loop print retrive list");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");   
        }

        // for-each to retrive the arraylist
        System.out.println("using for-each loop to retrive the arraylist :");
        for (String s : list) {
            System.out.print(" "+s);
        }

        // remove the element in arraylist using the -> object
        list.remove("boy");

        //remove the element using -> index
        list.remove(0);

        //sort the list
        Collections.sort(list);
        System.out.println(list);
        
        // new arraylist to sort the element //
        ArrayList<Integer> nums=new ArrayList();
        nums.add(5);
        nums.add(3);
        nums.add(4);
        Collections.sort(nums);
        System.out.println(nums);
    }
}

