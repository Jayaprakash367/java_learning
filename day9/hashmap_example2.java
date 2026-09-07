package day9;
import java.util.HashMap;
public class hashmap_example2 {
    public static void main(String[] args){
        HashMap<String,String> map=new HashMap<>();
        map.put("Name:", "Java");
        map.put("Version:", "1.8");
        map.put("Release Date:", "18 March 2014");
        System.out.println("Original Map :"+map);
        System.out.println("-----------------------------------");
        System.out.println("updated version :"+map.put("Version:","1.9"));
        System.out.println("Updated version :"+map.put("Version:","1.10"));

    }
}
