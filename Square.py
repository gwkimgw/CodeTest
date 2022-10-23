import math
from math import gcd

def solution(w,h):
    answer = 1
    
    g = gcd(w, h)
    answer = w*h - (w/g + h/g-1)*g
    
    return answer