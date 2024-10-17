package SET1;

import java.util.Scanner;

public class CheckPalindromeInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 5 numbers:");
        for(int i = 0; i < 5; i++){
            arr[i] =  sc.nextInt();
        }
        if(!(palindrome(arr))){
            System.out.println("not palindrome");
        }
        else{
            System.out.println("palindrome");
        }
    }
    static boolean palindrome(int[] arr){
        for(int i= 0; i < arr.length/2 ; i++){
            if(arr[i] == arr[arr.length - i - 1]){
                return true;
            }
        }
        return false;
    }
}
 
