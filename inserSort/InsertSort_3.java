package Day_10_14.Algorithm.inserSort;

import java.util.Arrays;

public class InsertSort_3 {

    public int[] iSort(int[] arr){

        for (int i = 1; i < arr.length; i++){
            int minValue = arr[i];
           for (int j = i; j>0; j--){
               if (arr[j] < arr[j-1]){
                   int tmp = arr[j-1];
                   arr[j-1] = arr[j];
                   arr[j] = tmp;
               }
           }System.out.println(Arrays.toString(arr));


           }
        return arr;
    }

    public static void main(String[] args) {
        InsertSort_3 insertSort = new InsertSort_3();
        int[] arr = {8,5,6,2,4};
        insertSort.iSort(arr);
        //System.out.println(Arrays.toString(insertSort.iSort(arr)));
    }
}

