a,b=map(int,input().split())
tested=[1920, 2880]
satisfied=False

for i in range(a,b+1,+1):
    if tested[0]%i==0 and tested[1]%i==0:
        satisfied=True
        break

if satisfied:
    print(1)
else:
    print(0)