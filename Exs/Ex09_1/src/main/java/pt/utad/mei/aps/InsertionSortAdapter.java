package pt.utad.mei.aps;

public class InsertionSortAdapter implements ArraySort {
    @Override
    public void sort(int[] arr) {
        var algorithm = new InsertionSort();
        algorithm.sortArray(arr);
    }
}
