def solution(s):
    answer = ''
    for i in s.split(' '):
        for idx in range(len(i)):
            answer += i[idx].upper() if idx%2 == 0 else i[idx].lower()
        answer += ' '
    return answer[:-1]