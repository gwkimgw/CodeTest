public class WhatsInS{
    public boolean solution(String s) {
        boolean answer = false;
        String p1 = "^[a-zA-Z]*$";
        String p2 = "^[0-9]*$";
        
        if(s.length() == 4 || s.length() == 6){
            if(s.matches(p1) != s.matches(p2)){ answer = true; }
        }    
        return answer;
    }
}