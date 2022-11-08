class Watermelon {
    public String solution(int n) {
        String answer = "";
        
        for(int i=1;i<=n;i++){
            String add = (i%2==0) ? "박" : "수";
            answer+=add;
        }
        
        return answer;
    }
}