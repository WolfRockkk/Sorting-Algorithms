package merge_sort;

/**
 * The merge sort algorithm follows the divide-and-conquer approach
 * by recursively splitting the array into two halves, sorting them,
 * and then merging the sorted halves.
 *
 * Step 1: If the array has only one element, return (Base Case).
 * Step 2: Split the array into two halves (left and right).
 * Step 3: Recursively apply merge sort on both halves.
 * Step 4: Merge the two sorted halves back together.
 * Step 5: Exit
 *
 * Time Complexity:  O(n log n) (Best, Worst, and Average Case)
 * Auxiliary Space:  O(n) (Extra space required for merging)
 */
public class MergeSort {
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2; // Find the middle point

            // Recursively sort the first and second halves
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Create temporary arrays
        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        // Copy data to temporary arrays
        System.arraycopy(arr, left, leftArr, 0, n1);
        System.arraycopy(arr, mid + 1, rightArr, 0, n2);

        // Merge the temp arrays back into the original array
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArr (if any)
        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightArr (if any)
        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
}
