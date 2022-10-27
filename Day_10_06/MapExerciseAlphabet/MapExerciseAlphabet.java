package Day_10_06.MapExerciseAlphabet;

public class MapExerciseAlphabet {
    public boolean isAlphabet(char c){ // 입력받는 문자가 알파벳인지 판단해주는 메서드
        if ( (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') ){
            return true;
        }else{
            return false;
        }
    }

}
