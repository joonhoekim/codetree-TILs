sum=0
cnt=0
while True:
    age=int(input())
    if age//10 != 2:
        break
    else:
        sum+=age
        cnt+=1
print(f'{sum/cnt:.2f}')