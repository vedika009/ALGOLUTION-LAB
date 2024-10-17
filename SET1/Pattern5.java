package SET1;

import java.util.Scanner;

public class Pattern5 {
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
            if(i%2 != 0){
                for(int j = 1; j <= cols; j++){
                    System.out.print(j);
                }
                System.out.println();
            }
            else{
                for(int j = cols; j >= 1; j--){
                    System.out.print(j);
                }
                System.out.println();
            }
        }
    }
}
