package Day_10_06.CodeUp21_30;
import java.util.Scanner;

public class CodeUp_1025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] s = str.split("");
        for(int j = 0; j <str.length(); j++ ) {
            System.out.print("[");
            System.out.print(s[j]);
            for (int i = str.length() - (j+1); i > 0; i--) {
                System.out.print("0");
            }
            System.out.print("]");
            System.out.println();
        }

        }
}


