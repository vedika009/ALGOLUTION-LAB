package SET2;

public class EquilibriumIndex {
    public static void main(String[] args) {
        int[] arr = {2,3,-1,8,4};
        //System.out.println(equilBrute(arr));
        System.out.println(equilOptimal(arr));
    }

    static int equilOptimal(int[] arr){
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum = totalSum + arr[i];
        }
        int sumLeft = 0;
        int sumRight = totalSum;
        for (int i = 0; i < arr.length; i++) {
            sumRight = sumRight - arr[i];
            if(sumRight == sumLeft){
                return i;
            }
            sumLeft = sumLeft + arr[i];
        }
        return -1;
    }
    static int equilBrute(int[] arr){
        int sumLeft = 0;
        int sumRight = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("for element: " + arr[i]);
            sumRight = 0;
            sumLeft = 0;
            for (int j = 0; j < i; j++) {
                sumLeft = sumLeft + arr[j];
                //System.out.println("sumLeft = " + sumLeft);
            }
            System.out.println("sumLeft = " + sumLeft);
            for (int j = i+1; j < arr.length; j++) {
                sumRight = sumRight + arr[j];
                //System.out.println("sumRight = " + sumRight);
            }
            System.out.println("sumRight = " + sumRight);
            if(sumRight == sumLeft){
                return i;
            }
        }
        return -1;
    }
}
