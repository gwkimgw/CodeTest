import java.util.*;

class NLCD {
    public int solution(int[] arr) {
        int answer = arr[0];
        for(int i=1;i<arr.length;i++){ answer = lcm(arr[i], answer); }
        return answer;
    }
        
    private static int lcm(int a, int b){ return a*b/gcd(a,b); }
        
    private static int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b, a%b);
    }
}