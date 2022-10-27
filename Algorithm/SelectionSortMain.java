package Day_10_13.Algorithm;

import java.util.Arrays;

public class SelectionSortMain {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 2, 3, 9, 28, 11};
        SelectionSort selectionSort = new SelectionSort();
        System.out.println(Arrays.toString(selectionSort.sSort(arr)));
    }
}
