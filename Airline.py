def solution(tickets):
    visited = ["ICN"]
    to_visit = []
    
    def dfs(head, tickets):
        if not tickets:
            return
        
        tmp = {}
        for i, t in enumerate(tickets):
            if t[0] == head:
                tmp[t[1]] = i
        if len(tmp) == 0:
            to_visit.append(visited.pop())
            dfs(visited[-1], tickets)
        else:
            tmp = sorted(tmp.items(), key = lambda x:x[0])
            t, j = tmp[0]
            visited.append(t)
            del tickets[j]
            dfs(t, tickets)
    
    dfs('ICN', tickets)
    
    if len(to_visit) > 0:
        while to_visit:
            visited.append(to_visit.pop())
        
    return visited