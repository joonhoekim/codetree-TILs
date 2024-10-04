def recursive(n):
    if n==0:
        return
    print('HelloWorld')
    recursive(n-1)

n = int(input())
recursive(n)