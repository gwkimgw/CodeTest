def solution(places):
    answer = []
    
    for i in places:
        ok = True
        for j in range(5):
            for k in range(5):
                if i[j][k] == "P":
                    if (j > 0 and i[j-1][k] == "P") or (j < 4 and i[j+1][k] == "P") or (k > 0 and i[j][k-1] == "P") or (k < 4 and i[j][k+1] == "P"):
                        ok = False
                elif i[j][k] == "O":
                    if (j > 0 and k > 0 and i[j-1][k] == "P" and i[j][k-1] == "P") or (j > 0 and k < 4 and i[j-1][k] == "P" and i[j][k+1] == "P") or (j < 4 and k < 4 and i[j+1][k] == "P" and i[j][k+1] == "P") or (j < 4 and k > 0 and i[j+1][k] == "P" and i[j][k-1] == "P") or (j > 0 and j < 4 and i[j-1][k] == "P" and i[j+1][k] == "P") or (k > 0 and k < 4 and i[j][k-1] == "P" and i[j][k+1] == "P"):
                            ok = False
        answer.append(0) if ok == False else answer.append(1)
        
    return answer