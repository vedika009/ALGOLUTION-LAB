package SET2;

import java.util.Arrays;

public class TwoSumProblem {
    public static void main(String[] args) {
        int[] arr = {3,2,6,9};
        int k = 8;
        System.out.println(twoSumOptimal(arr,k));
    }
    static int[] twoSumBrute(int[] arr, int k){
        int sum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                sum = arr[i] + arr[j];
                if(sum == k){
                    return new int[]{i,j};
                }
                else{
                    sum = 0;
                }
            }
        }
        return new int[]{-1,-1};
    }
    static boolean twoSumOptimal(int[] arr, int k){
        int i = 0;
        int j = arr.length - 1;
        Arrays.sort(arr);
        while(i<j){
            if(arr[i] + arr[j] == k){
                return true;
            }
            else if(arr[i] + arr[j] < k){
                i++;
            }
            else if(arr[i] + arr[j] > k){
                j--;
            }
        }
        return false;
    }
}
