n = int(input())

def sol(n):
    if n==0:
        return

    print('* '*n)
    sol(n-1)
    print('* '*n)

sol(n)