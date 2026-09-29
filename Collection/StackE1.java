package Collection;
import java.util.*;
public class StackE1 {
    public static void main(String[] args) {
        int[] arr={16,17,4,3,5,2};
        Stack<Integer> s=new Stack<>();
        s.push(arr[arr.length-1]);
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>s.peek()){
                s.push(arr[i]);
            }
        }
        while(!s.isEmpty()){
         System.out.println(s.pop()+" ");
        }

    }
}
