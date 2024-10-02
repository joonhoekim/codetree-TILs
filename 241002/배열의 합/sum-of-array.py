n = 4
for i in range(n):
    arr=list(map(int,input().split()))
    line_sum=0
    for j in range(n):
        line_sum+=arr[j]
    print(line_sum)