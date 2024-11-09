arr = list()
N = int(input())

for i in range(N):
  prompt = input()
  if prompt.startswith("push_back"):
    _, num = tuple(prompt.split())
    arr.append(int(num))
    
  elif prompt.startswith("pop_back"):
    arr.pop()
    
  elif prompt.startswith("size"):
     print(len(arr))
  
  elif prompt.startswith("get"):
     _, num = tuple(prompt.split())
     print(arr[int(num)-1])