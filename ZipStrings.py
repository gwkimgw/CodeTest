def solution(s):
    answer = 0
    
    slice = []
    for i in range(1, int(len(s)/2)+1):
        slice.append(i)

    for step in slice:
        print(step)
        empty = ''
        cnt = 1
        for j in range(0, len(s), step):
            if s[j:j+step] == s[j+step : j+step*2]:
                cnt += 1
                seed = s[j:j+step]
            elif cnt > 1:
                empty += str(cnt) + seed
                cnt = 1
            else:
                empty += s[j:j+step]
        if answer > len(empty) or answer == 0:
            answer = len(empty)
    
    if len(s) == 1:
        answer = 1
    return answer