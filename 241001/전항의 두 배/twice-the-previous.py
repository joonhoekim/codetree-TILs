a1, a2 = map(int, input().split())

def func(n):
    if n==1:
        return a1
    elif n==2:
        return a2

    return func(n-1) + 2*func(n-2)

list_ = [a1, a2]
for i in range(3, 11):
    list_.append(func(i))

print(' '.join(map(str, list_)))