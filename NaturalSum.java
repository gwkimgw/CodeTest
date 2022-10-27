class NaturalSum {
    public int solution(int n) {
        int answer = 1;
        for(int i=1;i<=n/2;i++){
            answer += sumNum(i, n);
        }
        return answer;
    }
    
    public static int sumNum(int i, int n){
        int sum = 0;
        while(true){
            sum+=i;
            if(sum>=n){
                if(sum==n) return 1;
                return 0;
            }
            i++;
        }
    }
}