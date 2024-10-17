package SET1;

import java.util.ArrayList;

public class merge2arrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 7, 15};
        int[] arr2 = {2, 4, 5, 6, 8};
        System.out.println(merge(arr1, arr2));
    }

    static ArrayList<Integer> merge(int[] arr1, int[] arr2){
        ArrayList<Integer> arr = new ArrayList<>();
        int low1 = 0;
        int low2 = 0;
        int high1 = arr1.length - 1;
        int high2 = arr2.length - 1;
        while(low1 <= high1 && low2 <= high2){
            if(arr1[low1] < arr2[low2]){
                arr.add(arr1[low1]);
                low1++;
            }
            else{
                arr.add(arr2[low2]);
                low2++;
            }
        }
        while(low1 <= high1){
            arr.add(arr1[low1]);
            low1++;
        }
        while(low2 <= high2){
            arr.add(arr2[low2]);
            low2++;
        }
        return arr;
    }
}
