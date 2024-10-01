n=int(input())

cnt = 0
for i in range(1,n+1):
    is_reap_exception = i%100==0 and i%400!=0
    is_reap = (i%4==0)
    if(is_reap and not is_reap_exception):
        cnt+=1

print(cnt)