package Day_10_12.알고리즘;

import Day_10_12.알고리즘.MaxNumber2;

public class MaxNumberMain2 {
    public static void main(String[] args) {
        MaxNumber2 maxNumber2 = new MaxNumber2();
        int[][] arr = new int[][]{
                {113,23,85,34,17,74,25,52,65},
                {10,7,39,42,88,52,14,72,63},
                {87,42,18,78,53,45,18,84,53},
                {34,28,64,85,12,16,75,36,55},
                {21,77,45,35,28,75,90,76,1},
                {25,87,65,15,28,11,37,28,74},
                {65,27,75,41,7,89,78,64,39},
                {47,47,70,45,23,65,3,41,44},
                {87,13,82,38,200,12,29,29,80}
        } ;

        if((maxNumber2.counter(arr))[0] == 200 ){
            System.out.printf("테스트 통과 입니다. 최대 값은 : %d이고 %d번째 숫자 입니다.",maxNumber2.counter(arr)[0],maxNumber2.counter(arr)[1],maxNumber2.counter(arr)[2]);
        } else {
            System.out.printf("테스트 실패 입니다. result = %d",maxNumber2.counter(arr));
        }
    }
}
