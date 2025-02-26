package bubble_sort;
/**
 * The bubble sort algorithm repeatedly swaps adjacent elements
 * if they are in the wrong order. This process continues until
 * the entire array is sorted.
 *
 * Step 1: Array arr with N size
 * Step 2: Initialise i = 0
 * Step 3: If (i < N-1), iterate through the array and compare arr[j] with arr[j+1]
 * Step 4: If arr[j] > arr[j+1], swap arr[j] and arr[j+1]
 * Step 5: If no swaps occurred during a full pass, the array is sorted; exit loop
 * Step 6: i = i + 1 and repeat Step 3
 * Step 7: Exit
 *
 * Time Complexity:  O(n^2) (Worst/Average Case), O(n) (Best Case when already sorted)
 * Auxiliary Space:  O(1) (In-place sorting algorithm)
 */

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no swaps were made, the array is already sorted
            if (!swapped) break;
        }
    }
}