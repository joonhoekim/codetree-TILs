# split(delimiter), default delimiter = " ", return list[]
# It's fine to use method chaining.

### explicit cast each element
# line = input().split(" ")
# answer = int(line[0])*int(line[1])
# print(answer)

### List Comprehension
# line = [int(x) for x in input().split()]
# answer = line[0] * line[1]
# print(answer)

### map & list
# line = list(map(int, input().split()))
# answer = line[0] * line[1]
# print(answer)

### just map
a, b = map(int, input().split())
answer = a*b
print(answer)