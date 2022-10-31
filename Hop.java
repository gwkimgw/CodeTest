class Hop {
    public long solution(int n) {
        if(n<3) return n;
        int[] fib = new int[n+1];
        fib[1] = 1; fib[2] = 2;
        
        for(int i=3;i<n+1;i++) fib[i] = fib[i-1]%1234567 + fib[i-2]%1234567;
        
        return fib[n]%1234567;
    }
}