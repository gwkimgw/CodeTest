def solution(clothes):
    answer = 1
    t = [j for i, j in clothes]
    c = [t.count(l) for l in set(t)]
    for k in c:
        answer *= k + 1
    return answer - 1