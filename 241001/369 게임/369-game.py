n=int(input())
for i in range(1, n+1):
    cond1 = i%3==0
    if cond1:
        print(0, end=" ")
        continue
    temp = i

    cond2=False
    while temp>0:
        last_digit = temp%10
        if(last_digit%3==0):
            cond2=True
            break
        temp /= 10
        
    if cond2:
        print(0, end=" ")
        continue
    
    print(i, end=" ")