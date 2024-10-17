package SET1;

import java.util.Scanner;

public class Pattern6 {
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
            if(i==1 || i==rows){
                for(int j = 1; j <= cols; j++){
                    System.out.print("1");
                }
            }
            else{
                System.out.print("1");
                for(int j = 1; j <= cols - 2; j++){
                    System.out.print("0");
                }
                System.out.print("1");
            }
            System.out.println();
        }
    }
}
