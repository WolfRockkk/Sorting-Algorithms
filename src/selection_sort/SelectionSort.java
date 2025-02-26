package selection_sort;

/**
 * The selection sort algorithm sorts an array by repeatedly
 * finding the minimum element (considering ascending order)
 * from the unsorted part and putting it at the beginning.
 *
 * Step 1: Array arr with N size
 * Step 2: Initialise i=0
 * Step 3: If(i<N-1) Check for any element arr[j] where j>i and arr[j]<arr[i] then Swap arr[i] and arr[j]
 * Step 4: i=i+1 and Goto Step 3
 * Step 5: Exit
 *
 * Time Complexity:  O(n2)
 * Auxiliary Space: O(1)
 */
public class SelectionSort {

    public static void selectionSort(int[] numbers) {
        int length = numbers.length;

        for(int i = 0; i < length - 1; i++) {
            int min = numbers[i];
            int indexOfMin = i;
            for(int j = i + 1; j < length; j++){
                if(numbers[j] < min){
                    min = numbers[j];
                    indexOfMin = j;
                }
            }
            swap(numbers, i, indexOfMin);
        }
    }
    private static void swap(int[] numbers, int a, int b){
        int temp = numbers[a];
        numbers[a] = numbers[b];
        numbers[b] = temp;
    }
}
