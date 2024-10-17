package SET1;/*
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *

*/

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Odd Rows: ");
        int rows = sc.nextInt();
        pattern(rows);
    }
    static void pattern(int rows){
        for(int i= 1; i <= rows; i++){
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i= 1; i <= rows - 1; i++){
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * rows) - (2 * i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
