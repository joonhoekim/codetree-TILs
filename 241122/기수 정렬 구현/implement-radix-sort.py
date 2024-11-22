# function radix_sort(arr, k)
#   # pos는 현재 보고있는 자리 수를 의미
#   for pos = k - 1 ... pos >= 0:
#     # 0부터 9까지 정렬결과를 담을 이차원 배열
#     set arr_new = [10][]
#     for i = 0 ... i < arr.size
#       set digit = posth digit of arr[i]
#       arr_new[digit].append(arr[i])

#     # 0부터 9까지 순서대로 안에 있는 값을 담아 arr로 옮긴다.
#     set store_arr = []
#     for i = 0 ... i < 10
#       for j = 0 ... j < arr_new[i].size
#         store_arr.append(arr_new[i][j])
  
#     arr = store_arr

#   return arr
MAX_K = 6
MAX_DIGIT = 10

n = int(input())
arr = list(map(int, input().split()))

p = 1
for pos in range(MAX_K):
  new_arr = [[] for _ in range(MAX_DIGIT)]
  for elem in arr:
    digit = (elem // p) % 10
    new_arr[digit].append(elem)

  arr = []
  for digit in range(MAX_DIGIT):
    for elem in new_arr[digit]:
      arr.append(elem)
  
    p *= 10

for elem in arr:
  print(elem, end=" ")