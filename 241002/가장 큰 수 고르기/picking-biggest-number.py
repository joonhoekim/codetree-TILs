import sys

arr = list(map(int, input().split()))
max=-sys.maxsize
for el in arr:
    if el>max:
        max=el
print(max)