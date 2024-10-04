input()
arr = list(map(int,input().split()))

list_ = []
answer = []

for i, el in enumerate(arr):
    list_.append(el)
    
    if i%2==0:
        arr.sort()
        answer.append(arr[i//2])

print(' '.join(map(str,answer)))