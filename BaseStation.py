from math import ceil

def solution(n, stations, w):
    answer = 0
    ww = 2*w+1

    point = 1
    for s in stations:
        answer += max(ceil((s-w-point)/ww), 0)
        point = s+w+1

    if n >= point:
        answer += ceil((n-point+1)/ww)

    return answer