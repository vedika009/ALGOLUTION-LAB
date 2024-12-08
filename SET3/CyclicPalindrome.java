package com.ALGOLUTION.SET3;

public class CyclicPalindrome {
    public static void main(String[] args) {
        String str = "aaaab";
        System.out.println(isCyclic(str));
    }
    static boolean isCyclic(String str){
        for (int i = 0; i < str.length(); i++) {
            String rotated = str.substring(i) + str.substring(0,i); // generate substrings
            if(isPalindrome(rotated)){
                return true;
            }
        }
        return false;
    }
    static boolean isPalindrome(String str){
        for (int i = 0; i < str.length() / 2; i++) {
            if(str.charAt(i) != str.charAt(str.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }
}
