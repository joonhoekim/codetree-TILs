# 최소 거리 계산 경우의 수
# 1. A에서 바로 B로 가는 경우
# 2. x위치 또는 y위치에서 텔레포트하는 경우

A, B, x, y = map(int, input().split())

# A에서 B로 바로 가는 경우
min_dist = abs(A-B)

# x에서 텔레포트하는 경우
min_dist = min(min_dist, abs(A-x) + abs(B-y))

# y에서 텔레포트하는 경우
min_dist = min(min_dist, abs(A-y) + abs(B-x))
print(min_dist)