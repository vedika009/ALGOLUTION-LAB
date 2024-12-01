package com.ALGOLUTION.SET3;

import java.util.Arrays;

public class MinimumProduct {
    public static void main(String[] args) {
        int[] arr = {198,76,544,123,154,675};
        int k = 2;
    }
    static int minProduct(int[] arr, int k){
        long minProd = 1;
        Arrays.sort(arr);
        for (int i = 0; i < k; i++) {
            minProd *= arr[i];
        }
        return (int)minProd;
    }
}
