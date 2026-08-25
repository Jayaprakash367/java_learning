package day11;
import java.util.HashMap;
public class Strobogrammatic {
     public static boolean isstrobogrammatic(String S){
        HashMap<Character,Character> map=new HashMap<>();
        map.put('0','0');
        map.put('1','1');
        map.put('6','9');
        map.put('8','8');
        map.put('9','6');
        int l=0,r=S.length()-1;
        while (l<=r) {
            if(!map.containsKey(S.charAt(1))){
                    return false;
            }
            if(S.charAt(l)!=map.get(S.charAt(r))){
                return false;
            }
            l++;
            r--; 
        }
        return true;

    }
    public static void main(String[] args) {
        String s="6810189";
        boolean result=isstrobogrammatic(s);
        System.out.println(result);

    }
}
