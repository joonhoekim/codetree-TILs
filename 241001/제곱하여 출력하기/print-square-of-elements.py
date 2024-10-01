# list comprehension 실습
# 가장 간단한 list comprehension은 아래와 같은 형태이다.
# [ <1>   <2> ]
# <1> 에는 append할 내용을 적는다.
# <2> 에는 for loop 을 적는다. for loop 의 변수가 <1>에 사용될 수 있다.
# 참고로 변수란 for <변수> in ...
# 이걸 쓰지 않아도, 조건에 따라 append 해주는 방식을 써도 된다. 다만 코드가 좀 더 길어진다.
# 좀 더 복잡한 list comprehension도 가능하다.
# [ <1>   <2>   <3> ]
# <1>, <2> 는 동일하다. append 할 내용과 for loop이다.
# <3> 은 조건문이다. 조건문을 true로 하는 변수만이 <1>에 따라 append 된다.
# <1> 은 하나의 식만 입력해야 한다. 하나의 식에서 변수를 여러 개 사용할 수 있다.
# <2> 에서 여러 개의 for 문을 사용할 수도 있다. 이 경우 N중 반복문 형태와 동일하게 된다.
# 네이밍 관련해서도 여러가지 컨벤션이 있는데
# 1. 안 쓸 변수는 __ 으로 이름을 짓는다. 언더바 두개.
# 2. 키워드랑 겹치는 경우는 뒤에 _ 를 붙여서 충돌을 피한다. list_
n=int(input())
arr=list(map(int,input().split()))
list_ = [el**2 for el in arr]
print(' '.join(map(str,list_)))