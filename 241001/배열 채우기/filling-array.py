arr=list(map(int,input().split()))
list_collector = []

for el in arr:
    if(el==0):
        break;
    else:
        list_collector.append(str(el))
print(' '.join(list_collector[::-1]))