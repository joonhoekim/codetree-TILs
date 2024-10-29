arr = list(map(int, input().split()))
n = len(arr)
arr.sort()
A, B, C = 0, 0, 0

for i in range(n-2):
  for j in range(1, n-1):
    for k in range(2, n):
      if i == j or j == k or i == k:
        continue
      
      if arr[i] + arr[j] + arr[k] == arr[n-1]:
        A = arr[i]
        B = arr[j]
        C = arr[k]

print(A, B, C)