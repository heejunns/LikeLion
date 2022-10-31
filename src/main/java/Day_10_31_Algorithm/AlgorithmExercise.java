package Day_10_31_Algorithm;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class AlgorithmExercise {

    public ArrayList<Integer> solution(int[] answers) {
       // int[] answer = {};
        int[] x1 = {1, 2, 3, 4, 5};
        int[] x2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] x3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == x1[i % 5]) {
                cnt1++;
            }
            if (answers[i] == x2[i % 8]) {
                cnt2++;
            }
            if (answers[i] == x3[i % 10]) {
                cnt3++;
            }
        }
        list.add(cnt1);
        list.add(cnt2);
        list.add(cnt3);
        list.sort(Comparator.reverseOrder());
        int max = list.get(0);

        for (int l = 0; l < list.size(); l++) {
            if (list.get(l) == max) {
                result.add(l+1);
            }
            }
        return result;
        }


    public static void main(String[] args) {
        AlgorithmExercise algorithmExercise = new AlgorithmExercise();
        int[] answers = {1,3,2,4,2};
        System.out.println(algorithmExercise.solution(answers));
    }
}
