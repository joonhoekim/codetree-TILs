import sys

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

n = input()
stack = Stack()

for i in n:
  if i == '()':
    stack.push('(')
  else:
    if stack.empty():
      print("No")
      sys.exit(0)

      s.pop()

if stack.empty():
  print("Yes")
else:
  print("No")