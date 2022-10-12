public class JadenCase {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] split = s.split(" ");
        
        for(String i:split){
            String ii = i.substring(0,1).toUpperCase() + i.substring(1).toLowerCase();
            answer.append(" ").append(ii);
        }
        
        return answer.toString().trim();
    }
}