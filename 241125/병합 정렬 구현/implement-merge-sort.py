n = int(input())
arr = list(map(int, input().split()))
merged_arr = [0] * n

def merge_sort(low, high): 
  if low < high: 
    mid = (low + high) // 2 
    merge_sort(low, mid) 
    merge_sort(mid + 1, high) 
    merge(low, mid, high) 

def merge(low, mid, high):
  l, r = low, mid + 1
  cnt = low
  while l <= mid and r <= high:
    if arr[l] <= arr[r]:
      merged_arr[cnt] = arr[l]
      cnt += 1
      l += 1
    else:
      merged_arr[cnt] = arr[r]
      cnt += 1
      r += 1

  while l <= mid:
    merged_arr[cnt] = arr[l]
    cnt += 1
    l += 1
  while r <= high:
    merged_arr[cnt] = arr[r]
    cnt += 1
    r += 1

  for k in range(low, high+1):
    arr[k] = merged_arr[k] 

merge_sort(0, n-1)

for i in range(n):
  print(arr[i], end=" ")

