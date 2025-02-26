package quick_sort;

/**
 * The quick sort algorithm follows the divide-and-conquer approach
 * by selecting a pivot element and partitioning the array around it.
 *
 * Step 1: Select a pivot element from the array.
 * Step 2: Rearrange elements so that elements less than the pivot
 *         go to the left and elements greater than the pivot go to the right.
 * Step 3: Recursively apply Quick Sort on the left and right subarrays.
 * Step 4: Repeat until the base condition is met (subarray size <= 1).
 * Step 5: Exit
 *
 * Time Complexity:  O(n log n) (Average Case), O(n^2) (Worst Case when always picking a bad pivot)
 * Auxiliary Space:  O(log n) (Due to recursive calls)
 */
public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array and get the pivot index
            int pivotIndex = partition(arr, low, high);

            // Recursively sort elements before and after partition
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choosing the last element as the pivot
        int i = low - 1; // Index of smaller element

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Swap pivot into its correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // Return the partition index
    }
}
