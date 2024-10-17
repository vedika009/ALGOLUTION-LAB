package SET2;

public class KthLargestElement {
    public static void main(String[] args) {
        int[] arr = {4, 8, 2, 5, 6, 3};
        int k = 3;  // Example: finding the 3rd largest element
        System.out.println("The " + k + "th largest element is: " + kthLargest(arr, k));
    }
    static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < n && arr[left] > arr[largest]){
            largest = left;
        }
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }
        if (largest != i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, n, largest);
        }
    }
    static void buildHeap(int[] arr) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
    }
    static int kthLargest(int[] arr, int k) {
        buildHeap(arr);
        int n = arr.length;
        for (int i = n - 1; i >= n - k; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
        return arr[n - k];
    }
}
