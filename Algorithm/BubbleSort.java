package Day_10_13.Algorithm;

public class BubbleSort {
    public int[] bSort(int[] arr){
        for (int i = 0; i <arr.length-1; i++){ // 정렬되지 않은 배열중 비교 후 가장 작은 값과 비교될 인덱스
            for (int j = i+1; j < arr.length; j++){ // 배열 인덱스를 전부 비교
                if (arr[i] > arr[j]){
                    int a = arr[i];
                    arr[i] = arr[j];
                    arr[j] = a;
                }
            }
        }return arr;
    }
}
