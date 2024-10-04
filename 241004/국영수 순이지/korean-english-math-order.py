# key=lambda x: (x[0], -x[1])

n = int(input())
list_ = []

for i in range(n):
    args = input().split()
    info = []
    info.append(args[0])
    info.extend(list(map(int,args[1:])))
    list_.append(info)

sorted_info = sorted(list_, key=lambda x: (-x[1],-x[2],-x[3]))

for el in sorted_info:
    print(' '.join(map(str, el)))