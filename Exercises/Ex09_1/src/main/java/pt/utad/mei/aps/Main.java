package pt.utad.mei.aps;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] values = {1, 7, 2, -6, 0, 4};

        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(values));

        var arraySort = new InsertionSortAdapter();
        arraySort.sort(values);

        System.out.println("After sorting:");
        System.out.println(Arrays.toString(values));
    }
}