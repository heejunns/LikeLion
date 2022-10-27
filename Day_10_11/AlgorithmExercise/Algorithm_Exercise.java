package Day_10_11.AlgorithmExercise;
import java.util.Scanner;
public class Algorithm_Exercise {
    public int sol(int num){
        String m = String.valueOf(num);
        int total = 0;
        for (int i = 0; i < m.length(); i++){
            total += Integer.parseInt(String.valueOf(m.charAt(i)));
        }
        return total;
    }

}
