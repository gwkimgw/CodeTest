import java.util.*;

class BoatLimit {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int l = people.length;
        Arrays.sort(people);
        
        if(people[0]+people[1] > limit) return l;
        
        int point = 0;
        for(int i=l-1;point<=i;i--){
            if(people[point] + people[i] <= limit) point++;
            answer++;
        }
        
        return answer;
    }
}