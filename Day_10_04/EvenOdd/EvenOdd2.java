package Day_10_04.EvenOdd;

import java.util.Scanner;

public class EvenOdd2 {
    private String whatEvenOdd(int num) {
        if (num % 2 == 0) {
            return "짝수";
        } else {
            return "홀수";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        EvenOdd2 evenodd2 = new EvenOdd2();
        System.out.printf("%s+%s=%s",evenodd2.whatEvenOdd(n),evenodd2.whatEvenOdd(m),evenodd2.whatEvenOdd(n+m));



    }

}


