package Day_10_04.Practice;

import java.util.*;
public class Practice_10_04_02 {
    public static void main(String[] args) {
        int[] moneys = new int[]{50000,10000,5000,1000,500,100,50,10} ;
        int[] result = new int[moneys.length];
        ArrayList<Integer> total = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("금액을 넣으세요 :");
        int money_input =  sc.nextInt();
        for (int i = 0; i < moneys.length; i++) {
            int x = money_input/moneys[i];
            int remain = money_input%moneys[i];
            money_input = remain;

            result[i] = x;
        }
        for (int l = 0; l<8; ++l) {
            System.out.printf("%d원 %d개\n",moneys[l],result[l]);
        }
        sc.close();
    }

}


