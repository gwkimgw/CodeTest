import re
from itertools import product

def solution(user_id, banned_id):
    m = ([j for j, jj in enumerate(user_id) if re.match(f"^{i.replace('*', '.')}$", jj)]
        for i in banned_id)

    s = (set(k) for k in product(*m))
    s = set(tuple(l) for l in s if len(l) == len(banned_id))
    return len(s)