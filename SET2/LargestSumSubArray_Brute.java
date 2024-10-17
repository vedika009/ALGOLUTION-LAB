package SET2;

public class LargestSumSubArray_Brute {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(longest(arr));
    }
    static int longest(int[] arr){
        int sum = 0;
        int max = 0;
        int length = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];
                if(sum>max){
                    max = sum;
                }
            }
        }
        return max;
    }
}
