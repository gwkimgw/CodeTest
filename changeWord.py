from collections import deque

def check(w1, w2):
    diff = 0
    for i1, i2 in zip(w1, w2):
        if i1 != i2:
            diff += 1
    if diff >= 2:
        return False
    return True

def solution(begin, target, words):
    answer = 0
    if target not in words:
        return 0
    
    visited = [False]*(len(words))
    queue = deque([(begin, 0)])
    
    while queue:
        w, cnt = queue.popleft()
        if w == target:
            answer = cnt
        for i in range(len(words)):
            if check(words[i], w) and not visited[i]:
                visited[i] = True
                queue.append([words[i], cnt+1])
            
    return answer