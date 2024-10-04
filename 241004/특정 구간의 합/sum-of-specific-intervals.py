n, m = map(int,input().split())
list_ = list(map(int,input().split()))

for i in range(m):
    start, end = map(int, input().split())
    
    print(sum(list_[start-1 : end-1+1]))