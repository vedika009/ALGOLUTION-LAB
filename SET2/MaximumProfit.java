package SET2;

public class MaximumProfit {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println("Profit = " + profit(prices));
    }
    static int profit(int[] arr){
        int i = 0;
        int min = arr[0];
        int j = 0;
        int max = arr[0];
        for (i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("min price: " + min);
        for (int k = 0; k < arr.length; k++) {
            if(arr[k] == min){
                j = k;
            }
        }
        System.out.println("min index = " + j);
        if(j<arr.length-1) {
            max = arr[j + 1];
        }
        for (int k = j + 1; k < arr.length; k++) {
            if(max < arr[k]){
                max = arr[k];
            }
        }
        System.out.println("Max price: " + max);
        System.out.println("max - min = " + max + "-" + min);
        return max - min;
    }
}
