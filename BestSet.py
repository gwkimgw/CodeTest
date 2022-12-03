def solution(n, s):
    if s < n: return [-1]
    answer = []
    for _ in range(n): answer.append(s//n)
    if sum(answer) != s:
        for i in range(s%n):
            answer[-1-i] += 1 
    return answer