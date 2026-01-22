public class array_example_reverse {
    public static void main(String[] args) {
    String name="Jayaprakash";
    int len=name.length() - 1;
    for(int i=len; i>=0; i--) {
        System.out.println(name.charAt(i));  
    }
}
}