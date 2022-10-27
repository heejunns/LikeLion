package Day_10_05.RandomNumber_Method;

public class RandomCalcualtorMain {
    public static void main(String[] args) {
        NumberMaker numberMaker = new RandomNumberMaker();
        RandomCalculator randomCalculator = new RandomCalculator(numberMaker);
        randomCalculator.plus(20);
        randomCalculator.minus(20);
        randomCalculator.multiple(20);
        randomCalculator.divide(20);
        randomCalculator.divide2(3);
    }

}