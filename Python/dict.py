my_dict={
    'name':'liuliuliu',
    'age':22,
    'sex':'男'
}
for key in my_dict.keys():
    print(key,end=' ')
print()
for value in my_dict.values():
    
    print(value,end=' ')
print()
for key,value in my_dict.items():
    print(f"{key}:{value}")
print(my_dict.items())# 可解析