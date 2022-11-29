def solution(n):
    j = n
    cnt = binCnt(n)
    while j < 1000000:
        j += 1
        if binCnt(j) == cnt:
            return j

def binCnt(m):
    cnt = 0
    for i in str(bin(m)):
        if i == '1':
            cnt += 1
    return cnt