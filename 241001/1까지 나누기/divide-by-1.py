n=int(input())
cnt=0
divider = 1
while n>1:
    n/=divider
    divider+=1
    cnt+=1
print(cnt)