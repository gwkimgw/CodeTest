def solution(N, number):
    if N == number:
        return 1

    caseList = [0, [N]]
    for i in range(2, 9):
        prev=[]
        prev.append(int(str(N)*i))
        for j in range(1, i//2+1):
            for x in caseList[j]:
                for y in caseList[i-j]:
                    prev.extend([x+y, x-y, y-x, x*y])
                    if x != 0 and y != 0:
                        prev.extend([y/x, x/y])
            if number in prev:
                return i
            caseList.append(prev)
    return -1
