package day7;

public class find_max_min {
    public static void main(String[] args) {
        int [] num1={10,20,30,40,50};
        int max=num1[0];
        int min=num1[0];
        for(int i=1;i<num1.length;i++){
            if(num1[i]>max){
                max=num1[i];
            }
            if(num1[i]<min){
                min=num1[i];
            }
        }
        System.out.println("Maximum value is :"+max);
        System.out.println("Minimum value is :"+min);
    }
}