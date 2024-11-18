n = int(input())
arr = list(map(int, input().split()))
size = len(arr)



for i in range(size):
  min = i
  for j in range(min, size):
    if arr[j] < arr[min]:
      min = j

  arr[i], arr[min] = arr[min], arr[i]


for i in range(n):
  print(arr[i], end= " ")
