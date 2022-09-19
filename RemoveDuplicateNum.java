import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        int tmp = -1;
        for(int i : arr) {
            if(tmp != i) {
                answer.add(i);
            }
            tmp = i;
        }

        int [] realAnswer = new int[answer.size()];
        
        for(int j=0;j<answer.size();j++) {
            realAnswer[j] = answer.get(j);
        }
        
        return realAnswer;
    }
}