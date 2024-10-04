def solution(n):
    if n==0:
        return

    
    print(n, end=' ')
    solution(n-1)
    print(n, end=' ')

n = int(input())
solution(n)