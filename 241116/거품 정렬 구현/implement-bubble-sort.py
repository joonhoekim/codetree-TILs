n = int(input())
arr = list(map(int, input().split()))

sorted = False

while not sorted:
  sorted = True
  for i in range(n-1):
    if arr[i] > arr[i + 1]:
      arr[i], arr[i + 1] = arr[i + 1], arr[i]
      sorted = False

for i in range(n):
  print(arr[i], end= " ")
