public class ReturnCoke {
    int answer = 0;
    public int solution(int a, int b, int n) {
        answer += n/a*b;
        n = n/a*b + n%a;
        if(n >= a){ solution(a, b, n); }
        return answer;
    }
}