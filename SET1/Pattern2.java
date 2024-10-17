package SET1;

import java.util.Scanner;
public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Rows: ");
        int rows = sc.nextInt();
        pattern(rows);
    }
    static void pattern(int rows){
        for(int i = 1; i <= rows; i++){
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
