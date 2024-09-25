def backtrack(K, N, current, result):
    if len(current) == N:
        result.append(current[:])
        return
    
    for i in range(1, K + 1):
        if len(current) >= 2 and current[-1] == current[-2] == i:
            continue
        current.append(i)
        backtrack(K, N, current, result)
        current.pop()

def solve(K, N):
    result = []
    backtrack(K, N, [], result)
    return result

K, N = map(int, input().split())

sequences = solve(K, N)

for seq in sequences:
    print(' '.join(map(str, seq)))