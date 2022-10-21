public class Bracket {
    boolean solution(String s) {
        int cnt = 0;
        
        for(char i:s.toCharArray()){
            if (i == '(') cnt++;
            else if (i == ')'){
                cnt--;
                if (cnt<0) return false;
            }
        }

        boolean answer = (cnt==0) ? true:false;
        return answer;
    }
}