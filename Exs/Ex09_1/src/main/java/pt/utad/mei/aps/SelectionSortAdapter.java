package pt.utad.mei.aps;

public class SelectionSortAdapter implements ArraySort {
    @Override
    public void sort(int[] arr) {
        SelectionSort.sortData(arr);
    }
}
