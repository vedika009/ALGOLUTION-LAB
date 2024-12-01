package com.ALGOLUTION.SET3;

public class Anagram_Palindrome {
    public static void main(String[] args) {
        String str = "rotator";
        System.out.println(isPalindromeAnagram(str));
    }
    static boolean isPalindromeAnagram(String str){
        int[] count = new int[256]; // for number of characters
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        // count odd occurring characters
        int oddCount = 0;
        for (int i = 0; i < count.length; i++) {
            if(count[i] % 2 != 0){
                oddCount++;
            }
            if(oddCount > 1){
                return false;
            }
        }
        return true;
    }
}
