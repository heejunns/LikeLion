package Day_10_12.알고리즘;

import Day_10_12.알고리즘.MaxNumber1;

public class MaxNumberMain {
    public static void main(String[] args) {
        MaxNumber1 maxNumber1 = new MaxNumber1();
        int[] arr = new int[]{1,3,2,100,2,31,6,23};
        if(maxNumber1.counter(arr)[0] == 100){
            System.out.printf("테스트 통과 입니다. 최대 값은 : %d이고 %d번째 숫자 입니다.",maxNumber1.counter(arr)[0],maxNumber1.counter(arr)[1]);
        } else {
            System.out.printf("테스트 실패 입니다. result = %d",maxNumber1.counter(arr));
        }
    }
}
