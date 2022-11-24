import heapq
from heapq import heapify, heappush, heappop
def solution(n, works):
    works = [-i for i in works]
    heapify(works)
    while n > 0:
        if works[0] < 0:
            heappush(works, heappop(works)+1)
        else: break
        n-=1
        
    return sum([i**2 for i in works])