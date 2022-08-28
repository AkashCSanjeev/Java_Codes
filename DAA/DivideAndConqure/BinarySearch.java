import java.util.Scanner;

// Enter the array in sorted order

class BinarySearch {
    static void binarySearch(int arr[], int key, int low, int high) {
        int mid = (low + high) / 2;
        if (arr[mid] == key) {
            System.out.println("Value found at index " + mid);
        } else if (arr[mid] > key) {
            binarySearch(arr, key, low, mid - 1);
        } else {
            binarySearch(arr, key, mid + 1, high);
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter number of elements in array");
        int n = new Scanner(System.in).nextInt();
        int arr[] = new int[n];

        System.out.println("Enter elements in array");
        for (int i = 0; i < n; i++)
            arr[i] = new Scanner(System.in).nextInt();

        System.out.println("Enter key to find: ");
        int key = new Scanner(System.in).nextInt();

        binarySearch(arr, key, 0, n - 1);
    }
}