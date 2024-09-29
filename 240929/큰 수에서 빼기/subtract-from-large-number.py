a, b=map(int, input().split())
answer=0
if a>b:
    answer=a-b
else:
    answer=b-a
print(answer)