from itertools import combinations
def solution(nums):
    answer = 0
    for i in combinations(nums, 3):
        flag = True
        for j in range(2, sum(i)):
            if sum(i) % j == 0:
                flag = False
        if flag == True:
            answer+=1
    return answer