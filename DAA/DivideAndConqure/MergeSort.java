import java.util.Arrays;

class MergeSort {

    static void merge(int arr[], int low, int mid, int high) {

        int l[] = new int[mid - low + 1];
        int r[] = new int[high - mid];

        for (int i = 0; i < l.length; i++) {
            l[i] = arr[low + i];
        }
        for (int i = 0; i < r.length; i++) {
            r[i] = arr[mid + 1 + i];
        }

        int i = 0;
        int j = 0;
        int k = low;

        while ((i < l.length) && (j < r.length)) {

            if (l[i] <= r[j]) {
                arr[k] = l[i];
                i++;
                k++;
            } else {
                arr[k] = r[j];
                j++;
                k++;
            }

        }

        while (i < l.length) {
            arr[k] = l[i];
            i++;
            k++;
        }
        while (j < r.length) {
            arr[k] = r[j];
            j++;
            k++;
        }

    }

    static void mergeSort(int arr[], int low, int high) {
        if (high > low) {
            int mid = (low + high) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);

        }

    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1 };
        System.out.println(Arrays.toString(arr));
        mergeSort(arr, 0, 4);
        System.out.println(Arrays.toString(arr));

    }
}