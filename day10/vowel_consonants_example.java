package day10;

public class vowel_consonants_example {
    public static void main(String[] args) {
        String s="education";
        int vowel=0, consonant=0;
        String str=s.toLowerCase(); 
        for(int i=0;i<str.length();i++) {
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowel++;
            }else{
                consonant++;
            }
        }            
            System.out.println("Vowels:"+vowel);
            System.out.println("Consonant:"+consonant);
}
}