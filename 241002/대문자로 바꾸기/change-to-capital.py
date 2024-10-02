# 내장함수들을 이용한 간결한 풀이
row_count=5
# for i in range(row_count):
#     arr_2d=list(input().upper().split())
#     print(' '.join(arr_2d))

# 다른 언어에도 적용되는, 문자열의 정수값을 비교해 푸는 풀이
arr_2d = [
    list(input().split())
    for i in range(row_count)
]

# 하나씩 처리하는 방식
for i in range(row_count):
    for j in range(len(arr_2d[i])):
        arr_2d[i][j] = chr(ord(arr_2d[i][j]) + ord('A') - ord('a'))
        print(arr_2d[i][j], end=' ')
    print()