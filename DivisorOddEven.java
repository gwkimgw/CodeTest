public class DivisorOddEven {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i =left;i<right+1;i++){
            int divisor = divisor(i);
            if(divisor%2 == 0) answer+=i;
            else answer-=i;
        }
        return answer;
    }
    
    public int divisor(int i){
        int div = (i>1)? 2:1;
        for(int j=2;j<i/2+1;j++){ if(i%j==0){ div++; } }
        return div;
    }
}