from itertools import product

def solution(numbers, target):
    answer = 0
    
    length = len(numbers)
    for ops in list(map(''.join, product('+-', repeat = length))):
        compare = 0
        for op, num in zip(ops, numbers):
            if op == '+':
                compare += num
            else:
                compare -= num
        if compare == target:
            answer += 1
    
    return answer