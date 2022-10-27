package Day_10_05.RandomNumber_Method;

public class RandomNumberMaker implements NumberMaker {

    @Override // 인터페이스 메서드 구현
    public int maker(int num) {
        return (int)(Math.random() * num); // Math.random() 이 double 형이기 때문에 int 형으로 변환
    }
}
