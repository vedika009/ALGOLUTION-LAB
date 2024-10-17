package SET1;

import java.util.Arrays;

public class FrequencyOfNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2, 2, 2, 3, 3, 6};
        frequency(arr);
    }
    static void frequency(int[] arr){
        boolean[] visited = new boolean[arr.length];
        Arrays.fill(visited, false);
        for (int i = 0; i < arr.length; i++) {
            // Skip this element if already processed
            if (visited[i])
                continue;

            // Count frequency
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " : " + count);
        }
    }
}
