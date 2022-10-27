package Day_10_06.CodeUp21_30;
import java.util.Scanner;

public class CodeUp_1023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str.substring(0,str.indexOf('.')));
        System.out.println(str.substring(str.indexOf('.')+1));


    }
}
