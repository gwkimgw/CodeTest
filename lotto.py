def solution(lottos, win_nums):
    answer = []
    score = zeros = 0
    win_max = win_min = 6
    
    for i, e in enumerate(lottos):
        if e != 0 and e in win_nums:
            score += 1
        elif e == 0:
            zeros += 1
        
    if score > 1:
        win_min -= (score-1)
        win_max -= (score+zeros-1)    
    elif score <= 1 and zeros > 1:
        win_max -= (score+zeros-1)
    elif score == 1 and zeros == 1:
        win_min = 6
        win_max = 5
    
    answer.extend([win_max, win_min])
    
    return answer