package Day_10_15.Algorithm;

public class ChallengeProject {
    private String letter = "*";

    ChallengeProject(){

    }

    ChallengeProject(String letter){
        this.letter = letter;
    }
    public void makeStar(int n){
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <=i; j++){
            System.out.print(this.letter);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        ChallengeProject star = new ChallengeProject("#");
        star.makeStar(5);
    }
}
