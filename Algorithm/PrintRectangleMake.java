package Day_10_16.Algorithm;

public class PrintRectangleMake {
    public void makeRectangle(int a,int b){
        for (int i = 0; i<a; i++){
            for(int j = 0; j<b; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        PrintRectangleMake printRectangleMake = new PrintRectangleMake();
        printRectangleMake.makeRectangle(10,5);
    }
}
