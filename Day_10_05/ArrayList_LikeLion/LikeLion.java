package Day_10_05.ArrayList_LikeLion;

import java.util.ArrayList;
public class LikeLion {
    ArrayList<String> students = new ArrayList();
    public ArrayList<String> Likelionget(){ // 백엔드 멤버 리스트로 만들어 students 리스트 리턴 하는 메서드
        students.add("권하준");
        students.add("조성윤");
        students.add("안예은");
        students.add("남우빈");
        students.add("안준휘");
        students.add("하채민");
        students.add("허도한");
        students.add("배태훈");
        students.add("정해성");
        students.add("하찬희");
        students.add("박도아");
        students.add("유경준");
        students.add("고다니엘");
        students.add("하이안");
        students.add("고유호");
        students.add("전민찬");
        students.add("배강");
        students.add("유서이");
        students.add("황도빈");
        students.add("강규진");
        students.add("임예린");
        students.add("양예온");
        students.add("곽윤재");
        return students;
        }

    public void Likelionprint(){ // students 리스트 하나씩 출력하는 메서드
        for(String student : students){
            System.out.println(student);
        }
    }



}