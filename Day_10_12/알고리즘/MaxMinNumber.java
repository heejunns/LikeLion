package Day_10_12.알고리즘;

public class MaxMinNumber {
    public int counterMax(int[] arr){
        int x = arr[0]; // x를 0으로 초기화하면 음수 비교에서 0이 나옴
        for (int i = 1; i < arr.length; i++){ // i의 값은 1로 초기화
            if (x<arr[i]){ // 크기 비교
                x = arr[i]; // 저장되어 있는 x의 값보다 크다면 x에 큰 값을 저장
            }
        }
        return x;
    }
    public int counterMin(int[] arr){
        int x = arr[0]; // x를 0으로 초기화하면 음수 비교에서 0이 나옴
        for (int i = 1; i < arr.length; i++){ // i의 값은 1로 초기화
            if (x>arr[i]){ // 크기 비교
                x = arr[i]; // 저장되어 있는 x의 값보다 크다면 x에 큰 값을 저장
            }
        }
        return x;
    }

    public static void main(String[] args) {
        MaxMinNumber maxMinNumber = new MaxMinNumber();
        int[] arr = new int[]{1,3,2,100,2,31,6,23};
        System.out.printf("가장 큰 값은 : %d 입니다.\n",maxMinNumber.counterMax(arr));
        System.out.printf("가장 작은 값은 : %d 입니다.\n",maxMinNumber.counterMin(arr));
    }
}