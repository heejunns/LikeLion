package Day_10_28_algorithm;
import java.util.HashSet;
import java.util.Set;

public class Algorithm_01 {
   public int solution(int[] nums){
       int a = nums.length/2;
       HashSet<Integer> Set = new HashSet<>();
       for (int i = 0; i < nums.length; i++) {
           Set.add(nums[i]);
       }
       if (Set.size() > a) {
           return a;
       } else {
           return Set.size();
       }
   }
    public static void main(String[] args) {
        Algorithm_01 algorithm_01 = new Algorithm_01();
        int[] nums = {3,3,3,2,2,4};
        System.out.println(algorithm_01.solution(nums));
    }
   }


