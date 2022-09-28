def solution(record):
    answer = []
    
    dict = {}
    for i in record:
        j = i.split()
        if j[1] not in dict:
            dict[j[1]] = j[2]
        elif j[1] in dict:
            if j[0] == "Enter" or j[0] == "Change":
                dict[j[1]] = j[2]
                    
    for j in record:
        k = j.split()
        if k[0] == "Enter":
            answer.append(str(dict[k[1]]) + "님이 들어왔습니다.")
        elif k[0] == "Leave":
            answer.append(str(dict[k[1]]) + "님이 나갔습니다.")
    
    return answer