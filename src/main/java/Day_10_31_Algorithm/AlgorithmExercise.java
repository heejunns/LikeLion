package Day_10_31_Algorithm;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class AlgorithmExercise {
    class int[] solution(int[] answers){
        int[] answer = {};
        int[] x1 = {1,2,3,4,5};
        int[] x2 = {2,1,2,3,2,4,2,5};
        int[] x3 = {3,3,1,1,2,2,4,4,5,5};
        int cnt1 =0;
        int cnt2 =0;
        int cnt3 =0;
        int max = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for( int i=0; i< answers.length; i++){
            if ( answers[i] == x1[ i % 5 ]) {
                cnt1++;
            }
            if ( answers[i] == x2[ i % 8 ]) {
                cnt2++;
            }
            if ( answers[i] == x3[ i % 10 ]) {
                    cnt3++;
        }
            list.add(cnt1);
            list.add(cnt2);
            list.add(cnt3);
            list.sort(Comparator.reverseOrder());
            // 일단 최대 맞힌 문제 수 찾기

        return answer;
}
