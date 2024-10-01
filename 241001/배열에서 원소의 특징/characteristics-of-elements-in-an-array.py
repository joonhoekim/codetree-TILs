arr = list(map(int,input().split()))
for i,el in enumerate(arr):
    if el%3==0:
        print(arr[i-1])
        break