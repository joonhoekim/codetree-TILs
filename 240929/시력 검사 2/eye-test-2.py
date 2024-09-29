es=float(input())
status=''
if es>=1.0:
    status='High'
elif es>=.5:
    status='Middle'
else:
    status='Low'

print(status)