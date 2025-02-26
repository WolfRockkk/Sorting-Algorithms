package insertion_sort;

/**
 * The insertion sort algorithm builds the sorted array one element at a time
 * by picking an element and placing it in its correct position.
 *
 * Step 1: Assume the first element is already sorted.
 * Step 2: Pick the next element and compare it with elements in the sorted part.
 * Step 3: Shift elements to the right to make space for the new element.
 * Step 4: Insert the element in its correct position.
 * Step 5: Repeat until the entire array is sorted.
 * Step 6: Exit
 *
 * Time Complexity:  O(n^2) (Worst and Average Case), O(n) (Best Case when already sorted)
 * Auxiliary Space:  O(1) (In-place sorting algorithm)
 */
public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1] that are greater than key
            // one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}

