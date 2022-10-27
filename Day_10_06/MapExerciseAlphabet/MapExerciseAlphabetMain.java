package Day_10_06.MapExerciseAlphabet;

import java.util.HashMap;

public class MapExerciseAlphabetMain {
    public static void main(String[] args) {
        String str1 = "aabbsdsdasdsadsa/fa/sf/".toUpperCase();
        HashMap<String, Integer> hashMap = new HashMap<>();
        MapExerciseAlphabet mapExerciseAlphabet = new MapExerciseAlphabet();
        for (int i = 0; i < str1.length(); i++){ // 문자열을 문자 하나씩 출력하기
            System.out.println(str1.charAt(i));
        }

        for (int i = 0; i < str1.length(); i++){  // 각각의 문자가 알파벳인지 판단하기
            System.out.println(mapExerciseAlphabet.isAlphabet(str1.charAt(i)));
        }

        for (char c = 'A'; c <= 'Z'; c++){ // map에 A~Z까지 등록
            hashMap.put(String.valueOf(c), 0);
        }
        for (int i = 0; i < str1.length(); i++){
            char c = str1.charAt(i);

            if (mapExerciseAlphabet.isAlphabet(c)){
                hashMap.put(String.valueOf(c),hashMap.get(String.valueOf(c))+1);
            }
        }
        System.out.println(hashMap); // 알파벳의 개수가 카운트되어서 map 형태로 출력

    }
}
