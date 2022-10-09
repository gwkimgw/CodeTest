class Solution {
    private String extendLen(String answer){
        while(answer.length() < 3){
            answer += answer.charAt(answer.length() - 1);
        }
        return answer;
    }
    
    public String solution(String new_id) {
        String answer = new_id
            .toLowerCase()
            .replaceAll("[^\\w-_.]", "")
            .replaceAll("[.]+", ".")
            .replaceAll("^[.]|[.]$", "");
        
        if(answer.length() == 0){
            answer = "a";
        }else if(answer.length() > 15){
            answer = answer.substring(0, 15).replaceAll("[.]$", "");
        }
        
        answer = extendLen(answer);
        
        return answer;
    }
}