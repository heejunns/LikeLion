package Day_10_06.MapExercise;

import Day_10_06.MapExercise.MapExercise;

public class MapExerciseMain {
    public static void main(String[] args) {
        MapExercise mapExercise = new MapExercise();
        System.out.println(mapExercise.mapMake()); //  map 출력
        System.out.println("남혜준님의 깃허브 주소는"+" "+mapExercise.mapMake().get("남혜준")+" "+"입니다."); // git 주소 출력
        System.out.println("map에 저장된 데이터의 개수는 :"+" "+mapExercise.mapMake().size()+"개 입니다.");
    }

}
