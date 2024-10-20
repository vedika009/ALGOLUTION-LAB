package SET3;

import java.util.ArrayList;
import java.util.List;

public class SpiralOrder {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20}
        };
        System.out.println(spiral(arr));
    }

    static List<Integer> spiral(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int right = m - 1;
        int bottom = n - 1;
        int left = 0;
        int top = 0;
        List<Integer> spi = new ArrayList<>();
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                spi.add(arr[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                spi.add(arr[i][right]);
            }
            right--;
            if(top<=bottom) {
                for (int i = right; i >= left; i--) {
                    spi.add(arr[bottom][i]);
                }
                bottom--;
            }
            for (int i = bottom; i >= top; i--) {
                spi.add(arr[i][left]);
            }
            left++;
        }
        return spi;
        //System.out.println(spi);
    }
}
