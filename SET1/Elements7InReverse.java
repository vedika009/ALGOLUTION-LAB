package SET1;

import java.util.Arrays;
import java.util.Scanner;

public class Elements7InReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];
        System.out.println("Enter 7 numbers");
        for(int i = 0; i < 7; i++){
            arr[i] =  sc.nextInt();
        }
        System.out.println(Arrays.toString(reverse(arr)));
    }
    static int[] reverse(int[] arr){
        for(int i = 0; i< (arr.length/2) ; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        return arr;
    }
}
