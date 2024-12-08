package com.ALGOLUTION.SET3;

public class ORAllSubArrays {
    public static void main(String[] args) {
        int[] arr = {1,4,6};
        System.out.println(ORBrute(arr));
        System.out.println(OR(arr));
    }
    static int ORBrute(int[] arr){
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            int current = 0;
            for (int j = i; j < arr.length; j++) {
                current = current | arr[j];
                result = result | current;
            }
        }
        return result;
    }
    static int OR(int[] arr){
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result = result | arr[i];
        }
        return result;
    }
}
