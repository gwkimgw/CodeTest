def solution(n,a,b):
    return [i for i in range(n) if (a-1)//2**i == (b-1)//2**i][0]