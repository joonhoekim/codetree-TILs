n=int(input())
length=2*n+1

for i in range(length):
    for j in range(length):
        if i%2==0 or j%2==0:
            print("*", end=" ")
        else:
            print(" ", end=" ")
    print()