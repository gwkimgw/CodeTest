class JadenCase {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        boolean first = true;
        
        for(char j:s.toCharArray()){
            answer.append(first ? Character.toUpperCase(j) : Character.toLowerCase(j));
            first = (j == ' ') ? true : false;
        }
        
        return answer.toString();
    }
}