input()
arr = list(map(int,input().split()))

arr.sort()
for el in arr:
    print(el, end=' ')
print()

arr.sort(reverse=True)

for el in arr:
    print(el, end=' ')