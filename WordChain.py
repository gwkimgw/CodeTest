def solution(n, words):
    tmp = words[0]
    w = [tmp]
    for i in range(1, len(words)):
        if words[i] not in w:
            if tmp[-1:] != words[i][:1]:
                return[i%n+1, i//n+1]
            w.append(words[i])
        else:
            return[i%n+1, i//n+1]
        tmp = words[i]
    return [0, 0]