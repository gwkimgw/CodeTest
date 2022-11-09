import java.util.ArrayList;
public class Hamburger {
    public int solution(int[] ingredient) {
        int answer = 0;
        ArrayList<Integer> s = new ArrayList<>();
        
        for(int i : ingredient){
            s.add(i);
            if(s.size() >= 4
               && s.get(s.size()-4) == 1
               && s.get(s.size()-3) == 2
               && s.get(s.size()-2) == 3
               && s.get(s.size()-1) == 1){
                answer++;
                for(int j=0;j<4;j++){ s.remove(s.size()-1); }
            }
        }
        return answer;
    }
}