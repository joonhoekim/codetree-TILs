arr = list(map(int,input().split()))
sum=0
cnt=0
criteria=250
for el in arr:
    if el<criteria:
        sum+=el
        cnt+=1
    else:
        break
print(f'{sum} {sum/cnt:.1f}')