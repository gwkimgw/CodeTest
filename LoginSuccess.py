def solution(id_pw, db):
    for i,j in db:
        if i == id_pw[0]:
            if j == id_pw[1]:
                return "login"
            else:
                return "wrong pw"
    return "fail"