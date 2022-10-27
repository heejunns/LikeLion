package Day_10_05.RandomNumber_Method;

public class RandomCalculator {
   private NumberMaker numberMaker;

   RandomCalculator(NumberMaker numberMaker){
       this.numberMaker = numberMaker;
   }
    public void plus(int num){
       int result = num + this.numberMaker.maker(10) ;
        System.out.println(result);
    }
   public void minus(int num){
        int result = num - this.numberMaker.maker(10);
        System.out.println(result);
    }
    public void multiple(int num) {
       int result = num * this.numberMaker.maker(10);
        System.out.println(result);
    }
   public void divide(int num) {
        if (num == 0) {
        System.out.println("랜덤하게 생성된 숫자가 0입니다.");
       } else {
            int result = num / this.numberMaker.maker(10);
            System.out.println(result);
        }
    }
    public void divide2(int num){
        if (num == 0) {
            System.out.println("랜덤하게 생성된 숫자가 0입니다.");
        } else {
            float result = (float)num / this.numberMaker.maker(10); // 값 손실을 막기 위해 num을 float 형으로 변환
            System.out.println(result);
        }
    }

}