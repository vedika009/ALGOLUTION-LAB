package com.ALGOLUTION.SET3;

import java.util.HashSet;

public class SquareFreeNumber { // square free divisor
    public static void main(String[] args) {
        int n = 72;
        System.out.println(countSquareFree(n));
    }
    static int countSquareFree(int n){
        HashSet<Integer> divisors = findDivisors(n);
        int count = 0;
        for (int divisor : divisors) {
            if(divisor != 1 && isSquareFree(divisor)){
                count++;
            }
        }
        return count;
    }
    static HashSet<Integer> findDivisors(int num){
        HashSet<Integer> divisors = new HashSet<>();
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if(num % i == 0){
                divisors.add(i);
                divisors.add(num/i);// adding both, in the list of divisors
            }
        }
        //System.out.println(divisors);
        return divisors;
    }
    static boolean isSquareFree(int num){
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if(num % (i*i) == 0){ // Check divisibility by any perfect square
                return false;
            }
        }
        return true;
    }
}
