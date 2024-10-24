package com.ALGOLUTION.SET3;

import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesisString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        //String str = ")()(";
        System.out.println(validParen(str1));
    }
    static boolean validParen(String str){
        Stack<Character> st = new Stack<>();
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if(ch[i] == '(') {
                st.push(ch[i]);
            }
            else{
                if(st.empty()){
                    return false;
                }
                char end = st.pop();
                if(ch[i] == ')' && end == '('){
                    continue;
                }
                else{
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
