str_ = 'LEBROS'
list_ = list(str_)
user_input = input()

if user_input in list_:
    print(list_.index(user_input))
else:
    print('None')