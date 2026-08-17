package day9;
import java.util.HashMap;
import java.util.Map;
public class Hashmap {
    public static void main(String[] args) {
        // To store key-value pairs in hashmap
        HashMap<String,String> map=new HashMap<>();
        map.put("name","Dinesh");
        map.put("house no", "30c");
        map.put("Area", "Saravanampatti");
        map.put("district", "Coimbatore");
        System.out.println("Original Map :"+map);
       
        //put(key,updated_value)-> updated element in hashMap
        map.put("house no", "40c");
        System.out.println("Updated house no:" +map);

        //get() -> Using key get  the value 
        System.out.println("Area: "+map.get("Area"));

        //containskey() -> to check key is exist on map
        System.out.println("district contains?"+map.containsKey("district"));
        
        //containsvalue() -> to check value is exist on map
        System.out.println("Dinesh Constains?"+map.containsValue("Dinesh"));
        
        // find the size of map
        System.out.println("Size: "+map.size());

        //remove any element 
        map.remove("Area");
        System.out.println("removing the Area:"+map);

        //iterate over Map
        for(Map.Entry<String,String> dataset:map.entrySet()){
              //retrive key
              String key= dataset.getKey();
              //retrive value
              String value=dataset.getValue();
              System.out.println(key+" : "+value); 
        }

        //print only key from HashMap
        System.out.println("Key on Map "+map.keySet());
    }
}
