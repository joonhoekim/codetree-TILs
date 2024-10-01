n=int(input())
for i in range(n, 0, -1):
    for j in range(i, 0, -1):
        for k in range(i, 0, -1):
            print('*',end='')
        print(' ',end='')
    print()