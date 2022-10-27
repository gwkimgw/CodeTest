class NaturalSum {
    public int solution(int n) {
        int answer = 1;
        for(int i=1;i<=n/2;i++){
            int count = i;
            int sum = 0;
            while(true){
                sum+=count;
                if(sum>=n){
                    if(sum==n) answer++;
                    break;
                }
                count++;
            }
        }
        return answer;
    }
}