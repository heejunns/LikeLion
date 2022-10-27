package Day_10_15.Algorithm;

public class Star_2 {
    public void makeStar(int n){
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Star_2 star = new Star_2();
        star.makeStar(5);
    }
}
