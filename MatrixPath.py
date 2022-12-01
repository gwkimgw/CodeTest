def solution(m, n, puddles):
    road = [[0]*(m+1) for _ in range(n+1)]
    road[1][1] = 1
    for i in range(1, n+1):
        for j in range(1, m+1):
            if [j, i] in puddles or [i, j] == [1,1]:
                continue
            else:
                road[i][j] = (road[i-1][j] + road[i][j-1]) % 1000000007
    return road[-1][-1]