n=int(input())
line = []
for i in range(n,0,-1):
    line.append(f'{i} ')

line = ''.join(line)

for _ in range(n):
    print(line)