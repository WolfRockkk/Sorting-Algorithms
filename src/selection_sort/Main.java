package selection_sort;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int [] numbers = new int[1000];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1000);
        }
        System.out.println("Numbers before sorting: " + Arrays.toString(numbers));
        long startTime = System.currentTimeMillis();
        SelectionSort.selectionSort(numbers);
        long endTime = System.currentTimeMillis();
        System.out.println(" Numbers after sorting: " + Arrays.toString(numbers));
        System.out.println("Time took: " + (endTime - startTime));
    }
}
