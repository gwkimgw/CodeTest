from itertools import groupby
import operator

def solution(genres, plays):
    answer = []
    
    tmp = {}
    for i in list(set(genres)):
        tmp[i] = {'cnt':0, 'rank':0, 'idx':[]}
        
    tmp2 = []
    for i, (j, k) in enumerate(zip(genres, plays)):
        tmp2.append([i, j, k])
    tmp2.sort(key = lambda x:-x[2])
        
    for j in range(len(tmp2)):
        tmp[tmp2[j][1]]['cnt'] += 1
        tmp[tmp2[j][1]]['rank'] += tmp2[j][2]
        tmp[tmp2[j][1]]['idx'].append(tmp2[j][0])
    
    sortTmp = []
    for k in list(set(genres)):
        sortTmp.append((k, tmp[k]['rank']))
    sortTmp.sort(key = lambda x:-x[1])
    
    for l in sortTmp:
        print(l)
        if tmp[l[0]]['cnt'] > 1:
            answer.extend(tmp[l[0]]['idx'][:2])
        else:
            answer.extend(tmp[l[0]]['idx'])
    
    return answer