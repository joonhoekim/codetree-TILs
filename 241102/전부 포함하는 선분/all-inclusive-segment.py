import sys

n = int(input())
x1, x2 = [],[]
answer = sys.maxsize

def get_min_length(idx):
  new_x1, new_x2 = [], []
  for i in range(n):
    if (i == idx):
      continue
    
    new_x1.append(x1[i])
    new_x2.append(x2[i])

  return max(new_x2) - min(new_x1)

for i in range(n):
  a, b  = map(int, input().split())
  x1.append(a)
  x2.append(b)

min_x = x1.index(min(x1))
max_x = x2.index(max(x2))

answer = min(answer, get_min_length(min_x))
answer = min(answer, get_min_length(max_x))

print(answer)