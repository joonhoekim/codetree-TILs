from collections import deque
# deque는 양 끝에서의 삽입 삭제 시간복잡도가 항상 O(1)인 자료구조이다.

class Queue:
  def __init__(self):
    self.dq = deque()

  def push(self, item):
    self.dq.append(item)

  def empty(self):
    return not self.dq

  def size(self):
    return len(self.dq)

  def pop(self):
    if self.empty():
      raise Exception("Queue is empty")

    return self.dq.popleft()

  def front(self):
    if self.empty():
      raise Exception("Queue is empty")

    return self.dq[0]


N, K = tuple(map(int, input().split()))
Q = Queue()

for i in range(1, N+1):
  Q.push(i)

while Q.size() > 1:
  for i in range(1, K):
    Q.push(Q.front())
    Q.pop()
  print(Q.front(), end=" ")
  Q.pop()


print(Q.front(), end=" ")

