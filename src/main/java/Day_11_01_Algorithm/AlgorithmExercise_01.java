package Day_11_01_Algorithm;

public class AlgorithmExercise_01 {
    public boolean isPrime(int a) {
        boolean result = true;
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                result = false;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        AlgorithmExercise_01 algorithmExercise_01 = new AlgorithmExercise_01();
        System.out.println(algorithmExercise_01.isPrime(13));
    }
}
