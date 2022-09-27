from heapq import heappush, heappop

def solution(scoville, K):
    answer = 0
    scoville.sort()
    
    while scoville[0] < K:
        if len(scoville) <= 1:
            return -1
        else:
            heappush(scoville, heappop(scoville)+heappop(scoville)*2)
            answer += 1
            
    return answer