import java.util.regex.Pattern;

class babble {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] nephew = {"aya", "ye", "woo", "ma"};
        String p = "^[0-9]*$";
        
        for(String c : babbling){
            for(String d : nephew){ c = c.replace(d, "0"); }
            if(Pattern.matches(p, c) == true) answer++;
        }
        
        return answer;
    }
}