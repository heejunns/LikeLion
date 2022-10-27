package Day_10_04.Practice;

public class Pracetice_10_04_04 {
    public static void main(String[] args) {
        int[] moneys = new int[]{50000,10000,5000,1000,500,100,50,10} ;
        int curr50000 = 50000;
        int curr10000 = 10000;
        int curr5000 = 5000;
        int curr1000 = 1000;
        int curr500 = 500;
        int curr100 = 100;
        int curr50 = 50;
        int curr10 = 10;

        int refund = 25000;

        System.out.printf("%d원 %d개 나머지 %d원 \n",curr50000,(refund/curr50000),(refund%curr50000));
        refund = refund%curr50000;
        System.out.printf("%d원 %d개 나머지 %d원 \n",curr10000,(refund/curr10000),(refund%curr10000));
        refund = refund%curr10000;
        System.out.printf("%d원 %d개 나머지 %d원 \n",curr5000,(refund/curr5000),(refund%curr5000));
        refund = refund%curr5000;
        System.out.printf("%d원 %d개 나머지 %d원 \n",curr1000,(refund/curr1000),(refund%curr1000));
        refund = refund%curr1000;
        System.out.printf("%d원 %d개 나머지 %d원 \n",curr500,(refund/curr500),(refund%curr500));
        refund = refund%curr500;
        System.out.printf("%d원 %d개 나머지 %d원 \n",curr100,(refund/curr100),(refund%curr100));
        refund = refund%curr100;
        System.out.printf("%d원 %d개 나머지 %d원 \n",curr50,(refund/curr50),(refund%curr50));
        refund = refund%curr50;
        System.out.printf("%d원 %d개 나머지 %d원 \n",curr10,(refund/curr10),(refund%curr10));

    }

}


