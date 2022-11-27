def solution(s):
    answer = []
    s2 = s[2:-2].split('},{')
    s2.sort(key=lambda x : len(x))
    for i in s2:
        tmp = set(list(map(int, i.split(','))))
        for j in tmp:
            if j not in answer:
                answer.append(j)
                
    return answer