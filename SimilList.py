def solution(s1, s2):
    return len([i for i in s1 for j in s2 if i==j])