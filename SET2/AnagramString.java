package SET2;

import java.util.ArrayList;
import java.util.Collections;

public class AnagramString {
    public static void main(String[] args){
        String s1 = "listen";
        String s2 = "silent";
        anagram(s1,s2);
    }
    static void anagram(String s1, String s2){
        ArrayList<Character> arr1 = new ArrayList<>();
        ArrayList<Character> arr2 = new ArrayList<>();
        char[] str1 = s1.toCharArray();
        char[] str2 = s2.toCharArray();
        for(int i = 0; i < str1.length; i++){
            arr1.add(str1[i]);
        }

        for(int i = 0; i < str2.length; i++){
            arr2.add(str2[i]);
        }

        Collections.sort(arr1);
        Collections.sort(arr2);

        if(arr1.equals(arr2)){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not anagram");
        }
    }
}
