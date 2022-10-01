from collections import Counter

def solution(participant, completion):
    answer = ''
    
    c1 = Counter(participant)
    c2 = Counter(completion)
    
    diff = c1 - c2
    
    for i in diff.elements():
        answer += i
    return answer