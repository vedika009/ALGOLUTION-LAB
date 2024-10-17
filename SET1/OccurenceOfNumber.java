package SET1;

public class OccurenceOfNumber {
    public static void main(String[] args) {
        int[] arr = {1, 23, 3, 25, 5};
        int trg = 23;
        System.out.println(occurrence(arr, trg));
    }
    static int occurrence(int[] arr, int trg){
        int occur = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == trg){
                occur++;
            }
        }
        if(occur == 0){
            return - 1;
        }
        return occur;
    }
}
