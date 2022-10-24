def solution(n, times):
    answer = 0
    times.sort()
    start, end = 1, times[-1] * n
    while start <= end:
        mid = (start+end) // 2
        cnt = 0
        for i in times:
            cnt += mid // i
            if cnt >= n:
                break
        if cnt >= n:
            end = mid - 1
        elif cnt < n:
            start = mid + 1
    answer = start
            
    return answer