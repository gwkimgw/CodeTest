import math

def solution(progresses, speeds):
    answer = []
    finish = []
    cnt = -1

    for i, j in zip(progresses, speeds):
        finish.append(math.ceil((100 - i) / j))       

    for i in finish:
        if cnt < i:
            answer.append(1)
            cnt = i
        else:
            answer[-1] += 1
        
    return answer