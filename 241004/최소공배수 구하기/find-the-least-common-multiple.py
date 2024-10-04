import math

def lcm(a,b):
    return a*b//math.gcd(a,b)

n,m = map(int,input().split())
print(lcm(n,m))