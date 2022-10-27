package Day_10_11.AlgorithmExerciseNewsol;

public class AlgorithmExerciseNewsol {

    public int solution (int num){
        int total = 0;
        while (num > 0 ){
            total += num%10;
            num = num/10;
        }
        return total;
    }
}
