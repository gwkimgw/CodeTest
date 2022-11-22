from collections import deque

def solution(cacheSize, cities):
    answer = 0
    cache = deque([])
    cities = list(map(lambda x: x.lower(), cities))

    if cacheSize == 0:
        return 5 * len(cities)

    for c in cities:
        if not c in cache:
            if len(cache) < cacheSize:
                cache.append(c)
            else:
                cache.popleft()
                cache.append(c)
            answer += 5
        else:
            cache.remove(c)
            cache.append(c)
            answer += 1
    return answer