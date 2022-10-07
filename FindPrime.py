import itertools as it
import math

def is_Prime(x):
    if x <= 1:
        return False
    else:
        for i in range (2, int(math.sqrt(x)) + 1):
            if x % i == 0:
                return False
    return True

def solution(numbers):
    answer = 0
    
    numset = set()
    for i in range(1, len(numbers)+1):
        numset.update(map(int, map(''.join, it.permutations(numbers, i))))
        
    for j in numset:
        if is_Prime(int(j)) is True:
            answer += 1
    
    return answer