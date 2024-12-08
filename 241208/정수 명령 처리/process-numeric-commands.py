class Stack:
  def __init__(self):
    self.items = []

  def push(self, item):
    self.items.append(item)

  def empty(self):
    return not self.items

  def size(self):
    return len(self.items)
      
  def pop(self):
    if self.empty():
      raise Exception("Stack is empty")

    return self.items.pop()

  def top(self):
    if self.empty():
      raise Exception("Stack is empty")

    return self.items[-1]

n = int(input())
stack = Stack()

for i in range(n):
  prompt = input()
  if prompt.startswith("push"):
    stack.push(int(prompt.split()[1]))
  
  elif prompt.startswith("empty"):
    if stack.empty():
      print(1)
    else:
      print(0)
  
  elif prompt.startswith("size"):
    print(stack.size())

  elif prompt.startswith("pop"):
    print(stack.pop())

  elif prompt.startswith("top"):
    print(stack.top())