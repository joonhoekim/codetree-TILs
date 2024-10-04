n=int(input())

list_ = []

for _ in range(n):
    list_.append(input())

sorted_list = sorted(list_)
print('\n'.join(sorted_list))