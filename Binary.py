def solution(s):
    cnt = cntz = 0
    while len(s) > 1:
        if '0' in s:
            cntz += s.count('0')
            s = s.replace('0','')
        s = format(len(s),'b')
        cnt += 1
    return [cnt,cntz]