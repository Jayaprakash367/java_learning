package day10;

public class string_Example2 {
    public static void main(String[] args) {
        String s="Java programming Language";

        // replace method
        String rep=s.replace(" ", "");
        System.out.println("--------------------------------------------------------");
        System.out.println("Input:"+s);
        System.out.println("--------------------------------------------------------");
        System.out.println("After removing  the space :"+rep);
        System.out.println("--------------------------------------------------------");

        // for loop method
        String newString="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!=' '){
               newString=newString+ch;
            }   
        } System.out.println(newString);
    }
}
