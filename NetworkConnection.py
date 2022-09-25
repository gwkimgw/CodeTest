from collections import deque

def bfs(graph, k, to_visit, visited):
    to_visit.append(k)
    while to_visit:
        start = to_visit.pop()
        if start not in visited:
            visited.append(start)
            for j in graph:
                if j[1][start[0]] == 1:
                    to_visit.append(j)

def solution(n, computers):
    answer = 0
    visited = []
    graph = []
    to_visit = deque()
    
    for i, com in enumerate(computers):
        graph.append([i, com])
                        
    for k in graph:
        if k not in visited:
            bfs(graph, k, to_visit, visited)
            answer += 1

    return answer