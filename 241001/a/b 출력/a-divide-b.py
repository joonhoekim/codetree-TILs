a, b = map(int, input().split())
print(f"{a//b}.",end="")

a = a%b
for __ in range(20):
    a=a*10
    print(a//b, end="")
    a=a%b