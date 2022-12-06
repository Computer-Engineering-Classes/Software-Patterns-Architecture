package pt.utad.mei.aps;

import java.util.Arrays;
import java.util.Random;

public class Main {
    private static void shuffleArray(int[] array) {
        int index;
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            index = random.nextInt(i + 1);
            if (index != i) {
                array[index] ^= array[i];
                array[i] ^= array[index];
                array[index] ^= array[i];
            }
        }
    }

    private static void printArray(int[] arr, String msg) {
        System.out.println(msg);
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] values = {1, 7, 2, -6, 0, 4};
        printArray(values, "Original array:");

        var arraySort = new InsertionSortAdapter();
        arraySort.sort(values);
        printArray(values, "Sorted array:");

        shuffleArray(values);
        printArray(values, "Shuffled array:");

        var selectionSortAdapter = new SelectionSortAdapter();
        selectionSortAdapter.sort(values);
        printArray(values, "Sorted array:");
    }
}