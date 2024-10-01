# 모든 원소 개수를 구할 때는 len(list_), 특정 값이 몇개 들어있는지는 list_.count(value)
n,m=map(int,input().split())
list_=list(map(int,input().split()))
print(list_.count(m))