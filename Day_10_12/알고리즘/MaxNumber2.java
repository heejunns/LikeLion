package Day_10_12.알고리즘;

public class MaxNumber2 {
    private int cnt = 0; // 배열의

    public int[]counter(int[][] arr){
        int x = arr[0][0]; // x를 0으로 초기화하면 음수 비교에서 0이 나옴, 0,0 자리 값으로 초기화
        int rememberMax[] = new int[2]; // 최대값과 인덱스값 저장
        for (int i = 0; i < 9; i++){
            for(int j = 1; j < 9; j++) {
                if (x < arr[i][j]) { // 크기 비교
                    x = arr[i][j]; // 저장되어 있는 x의 값보다 크다면 x에 큰 값을 저장
                    rememberMax[0] = i;
                    rememberMax[1] = j;
                }
            }
        }
        return new int[]{x,rememberMax[0],rememberMax[1]};
    }
}
