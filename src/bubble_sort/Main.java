package bubble_sort;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[100000];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100000);
        }

        System.out.println("Numbers before sorting: " + Arrays.toString(Arrays.copyOf(numbers, 100)));

        long startTime = System.currentTimeMillis();
        BubbleSort.bubbleSort(numbers);
        long endTime = System.currentTimeMillis();

        System.out.println("Numbers after sorting: " + Arrays.toString(Arrays.copyOf(numbers, 100)));
        System.out.println("Time took: " + (endTime - startTime) + "ms");
    }
}
