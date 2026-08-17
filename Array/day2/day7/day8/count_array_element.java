package day7.day8;

// --------count the frequency of  array in the element----------//
import java.util.Scanner;

public class count_array_element {
    public static void main(String[] args) {
         Scanner in=new Scanner(System.in);
         System.out.println("Enter the size of array:");
         int num=in.nextInt();
         int size[]=new int[num];
         System.out.println("Enter the number");

         // get the user input//
         for(int i=0;i<num;i++){
            size[i]=in.nextInt();
         }
        //-----using boolean for true or false statement-----//
         boolean visited[]=new boolean[size.length];
         int len=size.length;
         for(int i=0;i<len;i++){
            if(visited[i]==false){
                int count=1;
                visited[i]=true;
                for(int j=i+1;j<len;j++){
                    if(size[i]==size[j]){
                        count++;
                        visited[j]=true;
                    }
                }
                System.out.println("---------------------------");
                System.out.println("count of element is :"+size[i]+"->"+count);
                in.close();;
            }
         }
    }
}
