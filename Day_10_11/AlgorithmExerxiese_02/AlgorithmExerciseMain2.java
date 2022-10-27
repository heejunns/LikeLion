package Day_10_11.AlgorithmExerxiese_02;
import java.util.Scanner;
public class AlgorithmExerciseMain2 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;

        while (num > 0) {
            num = num / 10;
            count += 1;
        }
        System.out.println("입력한 숫자의 자릿수는 : "+count+"개 입니다.");
    }
}
