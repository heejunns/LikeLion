package Day_10_05.CodeUp11_20;
import java.util.Scanner;

public class CodeUp_1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int cnt = 0;
        String[] st = str.split("\\.");
        for (int n = st[0].length(); n<4; n++ ){
            st[0] = '0'+st[0];
        }
        for (int n = st[1].length(); n < 2; n++){
            st[1] = '0'+st[1];
        }

        for (int n = st[2].length(); n < 2; n++){
            st[2] = '0'+st[2];
        }

        System.out.println(st[0]+'.'+st[1]+'.'+st[2]);
    }
}
