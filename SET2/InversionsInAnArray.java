package SET2;

public class InversionsInAnArray {
    public static void main(String[] args) {
        int[] arr = {7, 2, 6, 3};
        System.out.println("\nTotal inversions: " + inversions(arr));
    }

    static int inversions(int[] arr){
        int count = 0;
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    count++;
                    System.out.println(arr[i] + ">" + arr[j]);
                }
            }
        }
        return count;
    }
}
