import java.util.LinkedHashMap;

class Mbti {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        char[] arr = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for(char s : arr) map.put(s, 0);
        
        for(int i=0;i<survey.length;i++){
            int j; int l; int c = choices[i];
            if(c!=4){             
                j = c<4 ? 0 : 1; l = c>4 ? c-4 : 4-c;
                char key = survey[i].charAt(j);
                map.put(key, map.get(key)+l);   
            }
        }
        
        for(int pos=0;pos<map.size();pos+=2){
            if(map.get(arr[pos]) >= map.get(arr[pos+1])){
                answer = answer + arr[pos];
            }else{
                answer = answer + arr[pos+1];
            }
        }
        
        return answer;
    }
}