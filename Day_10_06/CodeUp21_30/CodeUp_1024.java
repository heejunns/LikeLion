package Day_10_06.CodeUp21_30;
import java.util.Scanner;

public class CodeUp_1024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] result = str.split("");
        for (String s :result){
            System.out.println("'"+s+"'");
        }

    }
}


