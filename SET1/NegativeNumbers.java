package SET1;

import java.util.Scanner;

public class NegativeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[50];
        System.out.println("Enter numbers");
        for(int i = 1; i <= n; i++){
            arr[i] =  sc.nextInt();
        }
        System.out.println("Negative numbers in array are: " +  negative(arr));
    }
    static int negative(int[] arr){
        int count = 0;
        for(int i=0; i < arr.length ; i++){
            if(arr[i] < 0){
                count++;
            }
        }
        return count;
    }
}
