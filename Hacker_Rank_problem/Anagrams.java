package Hacker_Rank_problem;
import java.util.Scanner;
public class Anagrams{
    // function to check if two strings are anagrams
    static boolean isAnagram(String a, String b){
       if(a.length() !=b.length()){
         return false;
       } 
       int[] freqA=new int[26];
       int[] freqB=new int[26];

       // counting the frequency of each character in both strings
         for(int i=0;i<a.length();i++){
              freqA[a.charAt(i)-'a']++;
              freqB[b.charAt(i)-'a']++;
         }

         // comparing the frequency of each character in both strings
         for(int i=0;i<26;i++){
              if(freqA[i]!=freqB[i]){
                  return false;
              }
         }
            return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String a = sc.nextLine();
        System.out.print("Enter second string: ");
        String b = sc.nextLine();
        
        boolean result = isAnagram(a, b);
        // using ternary operator to print the result
        System.out.println(result ? "Anagrams" : "Not Anagrams");
    }
  
}
