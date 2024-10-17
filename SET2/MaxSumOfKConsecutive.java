package SET2;

public class MaxSumOfKConsecutive {
    public static void main(String args[]) {
        int[] arr = {1, 7, 6, 2, 3, 4, 5};
        int n = 7;
        int k = 2;
        System.out.println(findMaxConsSum(arr, n, k));
    }
    public static int findMaxConsSum(int arr[], int n, int k) {
        int currsum = 0;
        for (int i = 0; i < k; i++) {
            currsum += arr[i];
        }
        int maxsum = currsum;
        for (int i = k; i < n - k; i++) {
            currsum -= arr[i - k];
            currsum += arr[i];
            maxsum = Math.max(maxsum, currsum);
        }
        return maxsum;
    }
}
