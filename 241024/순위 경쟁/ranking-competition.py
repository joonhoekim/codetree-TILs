A = 0
B = 0
C = 0

n = int(input())

changes = [
  input().split()
  for _ in range(n)
]

def get_rank(a, b, c):
  # 단독 명예의 전당인 경우
  if (a > b and a > c):
    return 1
  elif (b > a and b > c):
    return 2
  elif (c > a and c > b):
    return 3
  # 2명이 명예의 전당인 경우
  elif (a == b and a > c):
    return 4
  elif (a == c and a > b):
    return 5
  elif (b == c and b > a):
    return 6
  # 3명 모두 명예의 전당인 경우
  elif (a == b and b == c):
    return 7

answer = 0
pre_code = 0

# 조합 계산
# 이전의 명예의 전당 코드와 다르면 카운트
for name, score in changes:
  value = int(score)
  if (name == 'A'):
    if (get_rank(A, B, C) != get_rank(A + value, B, C)):
      answer += 1
    A += int(score)
  elif (name == 'B'):
    if (get_rank(A, B, C) != get_rank(A , B + value, C)):
      answer += 1
    B += int(score)
  else:
    if (get_rank(A, B, C) != get_rank(A , B, C + value)):
      answer += 1
    C += int(score)

print(answer)