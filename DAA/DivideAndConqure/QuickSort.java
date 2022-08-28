import java.util.Arrays;

class QuickSort {

    static int partition(int arr[], int low, int high) {

        int pivot = low;
        int i = low + 1;
        int j = high;

        while (i <= j) {

            while ((i <= high) && (arr[i] <= arr[pivot])) {
                i++;
            }
            while ((arr[j] >= arr[pivot]) && (j > low)) {
                j--;
            }
            if (i <= j)
                swap(arr, i, j);
        }
        swap(arr, j, pivot);
        return j;
    }

    static void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void quickSort(int arr[], int low, int high) {
        if (high > low) {
            int p = partition(arr, low, high);
            quickSort(arr, low, p - 1);
            quickSort(arr, p + 1, high);

        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 3, 1 };
        System.out.println(Arrays.toString(arr));
        quickSort(arr, 0, 4);
        System.out.println(Arrays.toString(arr));
    }
}