package Day_10_11.AlgorithmExercise;

import Day_10_11.AlgorithmExercise.Algorithm_Exercise;

public class Algorithm_ExerciseMain {
    public static void main(String[] args) {
        Algorithm_Exercise algorithm_exercise = new Algorithm_Exercise();
        int result1 = algorithm_exercise.sol(1234);

        if (result1 == 10){
            System.out.println("테스트 통과 했습니다.");
        }else {
            System.out.printf("테스트 실패 result : %d",result1);
        }
    }
}
