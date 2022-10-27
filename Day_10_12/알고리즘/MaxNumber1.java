package Day_10_12.알고리즘;

public class MaxNumber1 {
    public int[] counter(int[] arr){
        int maxValue = arr[0]; // x를 0으로 초기화하면 음수 비교에서 0이 나옴, 배열의 0번째 값을 먼저 저장
        int maxValueIndex = 0; // 최대 값의 index 값 저장할 변수 0으로 초기화
        for (int i = 1; i < arr.length; i++){ // i의 값은 1로 초기화 하여 1부터 for문 시작
            if (maxValue<arr[i]){ // 크기 비교
                maxValue = arr[i]; // 저장되어 있는 x의 값보다 크다면 x에 큰 값을 저장
                 maxValueIndex = i; // maxValue에 저장된 값의 i index 값을 저장
            }
        }
        return new int[]{maxValue,maxValueIndex}; // 최대값과 최대값에 해당하는 index값 반환
    }
}
