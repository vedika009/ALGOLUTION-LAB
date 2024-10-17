package SET1;

public class UniqueNumbers {
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 1, 5 ,3};
        System.out.print("Unique numbers in array are: ");
        unique(arr);
    }
    static void unique(int[] arr){
        //ArrayList<Integer> arr1 = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j <= i; j++){
                if(i == j){
                    System.out.print(arr[i] + " ");
                }
                if(arr[i] == arr[j]){
                    break;
                }
            }
        }
    }
}
