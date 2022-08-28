import java.util.Arrays;

class MinMax {

    static void findMaxMin(int arr[], int low, int high, int[] maxMin) {

        if (low == high) {
            if (maxMin[0] < arr[low]) { // comparison 1
                maxMin[0] = arr[low];
            }

            if (maxMin[1] > arr[low]) { // comparison 2
                maxMin[1] = arr[low];
            }

            return;

        }
        if (low == high - 1) {
            if (arr[low] < arr[high]) // comparison 1
            {
                if (maxMin[1] > arr[low]) { // comparison 2
                    maxMin[1] = arr[low];
                }

                if (maxMin[0] < arr[high]) { // comparison 3
                    maxMin[0] = arr[high];
                }
            } else {
                if (maxMin[1] > arr[high]) { // comparison 2
                    maxMin[1] = arr[high];
                }

                if (maxMin[0] < arr[low]) { // comparison 3
                    maxMin[0] = arr[low];
                }
            }
            return;
        }

        int mid = (low + high) / 2;

        findMaxMin(arr, low, mid, maxMin);
        findMaxMin(arr, mid + 1, high, maxMin);
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 3, 1 };
        int maxMin[] = { Integer.MIN_VALUE, Integer.MAX_VALUE };
        findMaxMin(arr, 0, 4, maxMin);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(maxMin));
    }
}