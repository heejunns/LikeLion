package Day_10_05.CodeUp11_20;
import java.util.Scanner;

public class CodeUp_1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str.substring(0,str.indexOf('-'))+str.substring(str.indexOf('-')+1,str.length()));
    }
}
