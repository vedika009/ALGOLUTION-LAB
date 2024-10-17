package SET1;

import java.util.Scanner;
public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Rows: ");
        int rows = sc.nextInt();
        pattern(rows);
    }
    static void pattern(int rows){
        for(int i = 1; i <= rows; i++){
            for(int j = i; j <= rows-1; j++){
                System.out.print(j);
            }
            for(int k = 1; k <= i; k++){
                System.out.print(rows);
            }
            System.out.println();
        }
    }
}
