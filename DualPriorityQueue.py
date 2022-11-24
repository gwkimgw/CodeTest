import collections
from collections import deque

def solution(operations):
    answer = deque()
    for i in operations:
        ia = i.split()[0]
        ib = int(i.split()[1])
        if ia == 'I':
            answer.append(ib)
            answer = deque(sorted(answer, reverse=True))
        elif ia == 'D' and answer:
            if ib == 1:
                answer.popleft()
            elif ib == -1:
                answer.pop()
        else: continue
                
    if answer:
        return [answer[0], answer[-1]]
    else: return [0,0]