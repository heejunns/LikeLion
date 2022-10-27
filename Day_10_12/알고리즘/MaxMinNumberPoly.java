package Day_10_12.알고리즘;

interface Compare{
    boolean doSomething(int valueA,int valueB);
}
public class MaxMinNumberPoly {
    private int counter(int[] arr,Compare compare) { // callback
        int x = arr[0]; // x를 0으로 초기화하면 음수 비교에서 0이 나옴
        for (int i = 1; i < arr.length; i++) { // i의 값은 1로 초기화
            boolean isSth = compare.doSomething(arr[i], x);
            if (isSth) { // 크기 비교
                x = arr[i]; // 저장되어 있는 x의 값보다 크다면 x에 큰 값을 저장
            }
        }
        return x;
    }

        public int max(int[] arr){
            return counter(arr, new Compare() {
                @Override
                public boolean doSomething(int valueA, int valueB) {
                    return valueA > valueB;
                }
            });
        }
        public int min(int[] arr){
        return counter(arr, new Compare() {
            @Override
            public boolean doSomething(int valueA, int valueB) {
                return valueA < valueB;
            }
        });
        }
    public static void main(String[] args) {
        MaxMinNumberPoly maxMinNumberPoly = new MaxMinNumberPoly();
        int[] arr = new int[]{1,3,2,100,2,31,6,23};
        System.out.printf("가장 큰 값은 %d 입니다.\n",maxMinNumberPoly.max(arr));
        System.out.printf("가장 작은 값은 %d 입니다.\n",maxMinNumberPoly.min(arr));
    }
}


