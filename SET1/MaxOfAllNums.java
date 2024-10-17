package SET1;

import java.util.Scanner;

public class MaxOfAllNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 5 numbers");
        for(int i = 1; i < 5; i++){
            arr[i] =  sc.nextInt();
        }
        System.out.println("Max is: " +  negative(arr));
    }
    static int negative(int[] arr){
        int max = 0;
        for(int i=0; i < arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
