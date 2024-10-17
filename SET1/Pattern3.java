package SET1;

/*

*
**
***
****
*****
****
***
**
*

*/
import java.util.Scanner;
public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Columns: ");
        int cols = sc.nextInt();
        pattern(cols);
    }
    static void pattern(int cols){
        for(int i= 1; i <= cols; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i= cols - 1; i >= 1; i--) {
            for (int j = 1 ; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
