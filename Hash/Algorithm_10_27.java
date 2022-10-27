package Hash;

import java.util.HashMap;
import java.util.Map;

public class Algorithm_10_27 {
    // 동명이인을 찾아야 됨
    // 맵 안에 있다면
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> memo = new HashMap<>();
        for (int i = 0; i < participant.length; i++) {
            String key = participant[i];
            if (!memo.containsKey(key)) {
                memo.put(key, 0);
            }
            memo.put(key, memo.get(key) + 1);
        }
        for (int i = 0; i < completion.length; i++) {
            String key = completion[i];
            memo.put(key, memo.get(key) - 1);
        }
        for (String key : memo.keySet()) {
            if (memo.get(key) == 1) {
                return key;
            }
        }
        return "";
    }
    public static void main(String[] args) {
        String[] participant = {"leo","kiki","eden"};
        String[] completion = {"eden", "kiki"};
        Algorithm_10_27 algorithm_10_27 = new Algorithm_10_27();
        System.out.println(algorithm_10_27.solution(participant,completion));
    }
}
