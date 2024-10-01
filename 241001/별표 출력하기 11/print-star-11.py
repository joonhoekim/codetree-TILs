n=int(input())
length=2*n+1

for i in range(1,length+1):
    is_even_line = i%2==0
    if not is_even_line:
        for _ in range(length):
            print('* ',end="")
    else:
        for j in range(length):
            if j%2==0:
                print('* ',end="")
            else:
                print('  ',end="")
    print()