from collections import deque
# deque는 양 끝에서의 삽입 삭제 시간복잡도가 항상 O(1)인 자료구조이다.

dq = deque()
N = int(input())

for i in range(N):
  order = input()

  if order.startswith("push_back"):
    dq.append(order.split()[1])

  elif order.startswith("push_front"):
    dq.appendleft(order.split()[1])

  elif order.startswith("pop_front"):
    print(dq.popleft())

  elif order.startswith("pop_back"):
    print(dq.pop())

  elif order.startswith("size"):
    print(len(dq))
  
  elif order.startswith("empty"):
    if not dq:
      print(1)
    else:
      print(0)
  
  elif order.startswith("front"):
    print(dq[0])

  elif order.startswith("back"):
    print(dq[-1])

