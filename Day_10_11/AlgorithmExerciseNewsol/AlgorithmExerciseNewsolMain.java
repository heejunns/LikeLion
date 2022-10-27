package Day_10_11.AlgorithmExerciseNewsol;

public class AlgorithmExerciseNewsolMain {
    public static void main(String[] args) {
        AlgorithmExerciseNewsol algorithmExerciseNewsol = new AlgorithmExerciseNewsol();
        int result2 = algorithmExerciseNewsol.solution(1234);

        if (result2 == 10){
            System.out.println("테스트 통과 했습니다.");
        }else {
            System.out.printf("테스트 실패 result : %d",result2);
        }

    }
}
