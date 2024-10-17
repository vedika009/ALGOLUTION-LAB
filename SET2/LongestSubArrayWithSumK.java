package SET2;

import java.util.HashMap;

public class LongestSubArrayWithSumK {
    public static void main(String[] args) {
        //int[] arr = {1, 2, 3, 1, 1, 1, 1, 4, 2, 3};
        int[] arr = {2, 0, 0, 3};
        int k = 3;
        System.out.println(longest(arr, k));
    }
    static int longest(int[] arr, int k){
        int sum = 0;
        int maxLength = 0;
        HashMap<Integer, Integer> preSum = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if(sum==k){
                maxLength = Math.max(maxLength, i+1);
            }
            int rem = sum - k;
            if(preSum.get(rem) != null){
                int len = i - preSum.get(rem);
                maxLength = Math.max(len, maxLength);
            }
            if (preSum.get(sum) == null){ // if not already present in it, then only add
                preSum.put(sum, i);
            }
        }
        return maxLength;
    }

}
