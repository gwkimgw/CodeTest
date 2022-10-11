import java.util.*;

class Solution {
    public String solution(String s) {
        String[] st = s.split(" ");
        int[] nums = Arrays.stream(st).mapToInt(Integer::parseInt).sorted().toArray();
        
        return nums[0] + " " + nums[nums.length-1];
    }
}