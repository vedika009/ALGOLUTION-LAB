package SET1;/*
    *****
   *****
  *****
 *****
*****
 */

import java.util.Scanner;
public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Rows: ");
        int rows = sc.nextInt();
        System.out.print("Columns: ");
        int cols = sc.nextInt();
        pattern(rows, cols);
    }
    static void pattern(int rows, int cols){
        for(int i = 1; i <= rows; i++){
            for(int k = cols; k >= i; k--){
                System.out.print(" ");
            }
            for(int j = 1; j <= cols; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
