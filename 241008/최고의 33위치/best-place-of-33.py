n = int(input())

board = [list(map(int, input().split())) for _ in range(n)]

mask_size = 3
answer = 0

for i in range(n - mask_size + 1):
    for j in range(n - mask_size + 1):
        current_sum = sum(sum(row[j:j+mask_size]) for row in board[i:i+mask_size])
        answer = max(current_sum, answer)

print(answer)