money = int(input())
target=''
if money>=3000:
    target='book'
elif money>=1000:
    target='mask'
else:
    target='no'
print(target)