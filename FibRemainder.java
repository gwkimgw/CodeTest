public class FibRemainder {
    public static int fib(int n){
        int[] rem = new int[n+1];
        rem[0] = 0; rem[1] = 1;
        
        for(int j=2;j<n+1;j++) rem[j] = rem[j-1]%1234567+rem[j-2]%1234567;
        
        return rem[n-1]+rem[n-2];
    }
    
    public int solution(int n) {
        return fib(n);
    }
}
