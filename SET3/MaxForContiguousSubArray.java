package com.ALGOLUTION.SET3;

public class MaxForContiguousSubArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 4, 5};
        int k = 4;
        int[] arr1 = {8, 5, 10, 7, 9, 4, 15, 12, 90, 13};
        maxForCont(arr1, k);
    }
    static void maxForCont(int[] arr, int k){
        int low = 0;
        int high = k - 1;
        while(high!=arr.length){
            max(arr, low, high);
            low++;
            high++;
        }
    }
    static void max(int[] arr, int low, int high){
        int max = arr[low];
        for (int i = low; i <= high; i++) {
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.print(max+" ");
    }
}
