class Node:
  def __init__(self, data):
    self.data = data
    self.next = None
    self.prev = None

class DoublyLinkedList:
  def __init__(self):
    self.head = None
    self.tail = None
    self.node_num = 0

  def push_front(self, new_data):
    new_node = Node(new_data)
    new_node.next = self.head

    if self.head != None:
      self.head.prev = new_node
      self.head = new_node
      new_node.prev = None
    
    else:
      self.head = new_node
      self.tail = new_node
      new_node.prev = None

    self.node_num += 1

  def push_back(self, new_data):
    new_node = Node(new_data)
    new_node.prev = self.tail

    if self.tail != None:
      self.tail.next = new_node
      self.tail = new_node
      new_node.next = None
    
    else:
      self.head = new_node
      self.tail = new_node
      new_node.next = None

    self.node_num += 1

  def pop_front(self):
    if self.head == None:
      print("List is empty")

    elif self.head.next == None:
      temp = self.head

      self.head = None
      self.tail = None
      self.node_num = 0
      return temp.data
    
    else:
      temp = self.head
      temp.next.prev = None

      self.head = temp.next
      temp.next = None
      self.node_num -= 1

      return temp.data
    
  def pop_back(self):
    if self.tail == None:
      print("List is empty")
    
    elif self.tail.prev == None:
      temp = self.tail

      self.head = None
      self.tail = None
      self.node_num = 0
      return temp.data

    else:
      temp = self.tail
      self.tail = temp.prev
      temp.prev.next = None
      temp.prev = None

      self.node_num -= 1
      return temp.data
    
  def size(self):
    return self.node_num
  
  def empty(self):
    return self.node_num == 0
  
  def front(self):
    if self.head == None:
      print("List is empty")
    else:
      return self.head.data
    
  def back(self):
    if self.tail == None:
      print("List is empty")
    else:
      return self.tail.data
    

N = int(input())
list = DoublyLinkedList()

for i in range(N):
  prompt = input()

  if prompt.startswith("push_front"):
    data = int(prompt.split()[1])
    list.push_front(data)

  elif prompt.startswith("push_back"):
    data = int(prompt.split()[1])
    list.push_back(data)
  
  elif prompt.startswith("pop_front"):
    print(list.pop_front())
  
  elif prompt.startswith("pop_back"):
    print(list.pop_back())
  
  elif prompt.startswith("size"):
    print(list.size())
  
  elif prompt.startswith("empty"):
    if (list.empty()):
      print(1)
    else:
      print(0)
  
  elif prompt.startswith("front"):
    print(list.front())
  
  elif prompt.startswith("back"):
    print(list.back())