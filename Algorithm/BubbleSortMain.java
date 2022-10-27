package Day_10_13.Algorithm;

import java.util.Arrays;

public class BubbleSortMain {
    public static void main(String[] args) {
        int[] arr = new int[]{7,2,3,9,28,11};
        BubbleSort bubbleSort = new BubbleSort();
        System.out.println(Arrays.toString(bubbleSort.bSort(arr)));

    }
}
