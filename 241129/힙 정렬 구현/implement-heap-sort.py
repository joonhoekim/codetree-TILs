n = int(input())
arr = [0] + list(map(int, input().split()))

def swap(a, b):
  arr[a], arr[b] = arr[b], arr[a]

def heapify(n, i):
    largest = i
    l = i * 2
    r = i * 2 + 1
    
    if l <= n and arr[l] > arr[largest]:
      largest = l
    
    if r <= n and arr[r] > arr[largest]:
      largest = r

    if largest != i:
      swap(i, largest)
      heapify(n, largest)

def heap_sort(n):
  for i in range(n // 2, 0, -1):
    heapify(n, i)
  
  for i in range(n, 1, -1):
    swap(1, i)
    heapify(i - 1, 1)

heap_sort(n)

for i in range(1, n+1):
  print(arr[i], end=" ")