package com.ALGOLUTION.SET3;

import java.util.Arrays;

public class MinimumProduct {
    public static void main(String[] args) {
        int[] arr = {198,76,544,123,154,675};
        int k = 2;
        System.out.println(minProdOptimal(arr, k);
    }
    static int minProductBrute(int[] arr, int k){
        long minProd = 1;
        Arrays.sort(arr);
        for (int i = 0; i < k; i++) {
            minProd *= arr[i];
        }
        return (int)minProd;
    }
    static int minProdOptimal(int[] arr, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++)
            pq.add(arr[i]);

        int count = 0;
        //to hold larger values
        long ans = 1;

        // One by one extract items
        while(pq.isEmpty() == false && count < k)
        {
            ans = ans * pq.element()%1000000007;
            pq.remove();
            count++;
        }

        return (int)ans;
    }
}
