package day10;
public class string_reverse_example {
    public static void main(String[] args) {
        String s="java123";
        String rev="";
        for(int i=s.length()-1; i>=0;i--){
            rev=rev+s.charAt(i);
        }
        System.out.println("Input:"+s);
        System.out.println("reverse:"+rev);
    }
}
