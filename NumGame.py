def solution(A, B):
    answer = 0
    A.sort(), B.sort()
    for b in B:
        if b > A[0]:
            answer += 1
            del A[0]
    return answer