package SET1;

public class DuplicateElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 7, 8, 8, 3};
        System.out.println("duplicate elements are:");
        duplicate(arr);
    }
    static void duplicate(int[] arr){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    System.out.print(arr[i] + " ");
                    count++;
                }
            }
        }
        System.out.println();
        System.out.println("Total duplicate elements: " + count);
    }
}
