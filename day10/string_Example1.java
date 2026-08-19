package day10;

public class string_Example1 {
    public static void main(String[] args) {
        String s="Java Programming";
        //length() -> find the length of the string
        int len=s.length();
        System.out.println("------------------------------------------");
        System.out.println("INPUT :"+s);
        System.out.println("------------------------------------------");
        System.out.println("Length:"+len);
        System.out.println("------------------------------------------");

        //charAt() -> access specific char
        char ch=s.charAt(0);
        System.out.println("First letter :"+ch);
        System.out.println("------------------------------------------");

        //subString(beginIndex,endIndex) ->to find the substring
        String subs=s.substring(5,12);
        System.out.println("SubString:"+subs);
        System.out.println("------------------------------------------");
        
        // To upper case
        System.out.println("UpperCase:"+s.toUpperCase());
        System.out.println("------------------------------------------");
       
        // To lower Case
        System.out.println("LowerCase:"+s.toLowerCase());
        System.out.println("------------------------------------------");

        // to check Substring contains by the String
       System.out.println("<java> Contains:"+s.contains("Java"));
       System.out.println("------------------------------------------");

        // compare String but case sensitive this make the false statement
        String name="Java";
        boolean isSame=name.equals("java");
        System.out.println("Same Compare:"+isSame);
        System.out.println("------------------------------------------");
        
        // ignore the case sensitive
        boolean isSameCase= name.equalsIgnoreCase("java");
        System.out.println("Without case Sensitive:"+isSameCase);//true
        System.out.println("------------------------------------------");

        // to replace Substring or cahr
        System.out.println("replace Java to Python : "+s.replace("Java", "Python"));
        System.out.println("------------------------------------------");
    }
}
