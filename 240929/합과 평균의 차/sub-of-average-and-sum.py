a,b,c = map(int, input().split())
sum = a+b+c
avg = sum//3
opt = sum - avg
print(f"{sum}\n{avg}\n{opt}")