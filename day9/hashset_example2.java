package day9;
import java.util.Scanner;
import java.util.HashSet;
public class hashset_example2 {
public static void main(String[] args) {
    HashSet<Integer> set= new HashSet<>();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of elements you want to add in hashset :");
    int n = sc.nextInt();
    System.out.println("Enter the elements :");
    for(int i=0;i<n;i++){
        set.add(sc.nextInt());
    }
    System.out.println("Hashset elements are :"+set);
    sc.close();
}
}