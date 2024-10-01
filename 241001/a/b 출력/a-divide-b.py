a, b = map(int, input().split())

# 수동으로 나누기를 구현하는 방법
next_divided = a  # 처음에는 a로 시작
quotient = next_divided // b
rest = next_divided - quotient * b
numbers = []
numbers.append(str(quotient))  # 몫을 추가
numbers.append('.')  # 소수점 추가

# 소수점 아래 21자리 구하기
for _ in range(20):
    next_divided = rest * 10  # 나머지에 10을 곱하여 다음 피연산자 설정
    quotient = next_divided // b  # 새로운 몫 구하기
    numbers.append(str(quotient))  # 몫 추가
    rest = next_divided - quotient * b  # 새로운 나머지 계산

print(''.join(numbers))