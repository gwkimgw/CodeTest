def solution(numbers):
    return sorted(list(set([numbers[i]+numbers[j] for j in range(len(numbers)) for i in range(len(numbers)) if i != j])))