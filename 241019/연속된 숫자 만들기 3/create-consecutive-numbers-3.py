arr = list(map(int, input().split()))

arr.sort()

answer = 0
# 연속된 수인 경우
while (True):
  if (arr[0] + 1 == arr[1] == arr[2] - 1):
    break
  
  print(arr)

  temp = arr[1]
  if (arr[2] - arr[1] < arr[1]-arr[0]):
    arr[1] = arr[2]-2
    arr[2] = temp

  else:
    arr[1] = arr[0]+2
    arr[0] = temp
    
  answer += 1


print(answer)