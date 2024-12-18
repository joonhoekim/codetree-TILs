from collections import deque
# deque는 양 끝에서의 삽입 삭제 시간복잡도가 항상 O(1)인 자료구조이다.

dq = deque()

N = int(input())

for i in range(1, N+1):
  dq.append(i)

while len(dq) > 1:
  dq.popleft()
  dq.append(dq[0])
  dq.popleft()

print(dq[0])



