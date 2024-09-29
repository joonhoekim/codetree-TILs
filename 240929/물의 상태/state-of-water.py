temperature = int(input())
status = ''
if temperature<0:
    status='ice'
elif(temperature>=100):
    status='vapor'
else:
    status='water'

print(status)