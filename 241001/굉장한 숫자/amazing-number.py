a=int(input())
cond1 = a%2==1 and a%3==0
cond2 = a%2==0 and a%5==0

if cond1 or cond2:
    print('true')
else:
    print('false')