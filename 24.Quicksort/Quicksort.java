public class Quicksort {

    // Method to perform partition
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // choose last element as pivot
        int i = low - 1;       // index of smaller element

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // place pivot at the correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // pivot index
    }

    // Recursive QuickSort function
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // partition index
            int pi = partition(arr, low, high);

            // Recursively sort elements before and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Main function to test
    public static void main(String[] args) {
        int[] arr = { 10, 7, 8, 9, 1, 5 };
        int n = arr.length;

        System.out.println("Before Sorting:");
        for (int x : arr) System.out.print(x + " ");
        System.out.println();

        quickSort(arr, 0, n - 1);

        System.out.println("After Sorting:");
        for (int x : arr) System.out.print(x + " ");
    }
}
