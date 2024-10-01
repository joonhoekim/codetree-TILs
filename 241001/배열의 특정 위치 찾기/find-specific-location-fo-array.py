# 짝수(2의 배수) 혹은 N의 배수에 대해 구할 때
# %n == 0 형태로 조건처리하지 않아도 range(::)에서 step 으로 바로 가능

arr=list(map(int,input().split()))

mul_2_sum = 0
mul_3_sum = 0
mul_3_cnt = 0
#2의 배수
for i in range(1,len(arr),2):
    mul_2_sum+=arr[i]

for i in range(2,len(arr),3):
    mul_3_cnt+=1
    mul_3_sum+=arr[i]

print(f'{mul_2_sum} {mul_3_sum/mul_3_cnt:.1f}')