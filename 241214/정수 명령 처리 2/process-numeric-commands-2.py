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


n = int(input())
q = Queue()

for _ in range(n):
    command = input()
    if command.startswith("push"):
        x = int(command.split()[1])
        q.push(x)
    elif command == "pop":
        print(q.pop())
    elif command == "size":
        print(q.size())
    elif command == "empty":
        print(1 if q.empty() else 0)
    else:
        print(q.front())