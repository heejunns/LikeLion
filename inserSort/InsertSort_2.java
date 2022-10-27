package Day_10_14.Algorithm.inserSort;

import java.util.Arrays;

public class InsertSort_2 {

    public int[] iSort(int[] arr){
        int i = 1;
        if( arr[i] < arr[i-1]){
            int tmp = arr[i];
            arr[i] = arr[i-1];
            arr[i-1] = tmp;
        }
        //for (int i = 1; i < arr.length; i++){
           // int j = i-1
           // while (j>=0
       // }
        return arr;
    }

    public static void main(String[] args) {
        InsertSort_2 insertSort = new InsertSort_2();
        int[] arr = {8,5,6,2,4};
        int[] result = insertSort.iSort(arr);
        System.out.println(Arrays.toString(result));
    }
}

