public class array_reverse_example2 {
    public static void main(String[] args) {
        String name="Dinesh";
        int len=name.length() - 1;
        for(int i=len; i>=0; i--){
            System.out.println(name.charAt(i));
        }
    }
}

