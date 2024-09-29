h, w = map(int, input().split())
b = ((10000 * w) / h**2)
floored_b = b*10//10

print(f"{floored_b:.0f}")
if b>=25:
    print("Obesity")