import java.util.*;

class BoatLimit {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        
        if(people[0]+people[1] > limit) return people.length;
        
        int check = 0;
        for(int i: people){
            if(check+i<limit){
                check+=i;
            }else if (check+i>limit){
                answer+=2;
                check=0;
            }else{
                answer++;
                check=0;
            }
        }
        
        return answer;
    }
}