import random
with open('./Python/file.txt', 'a') as file: #!!!!! 文件对象创建形式
    file.write(str(random.random())+"\n")
with open('./Python/file.txt', 'r') as file:
    lines = file.readlines()
    for line in lines:
        print(line, end='')  # end='' 防止print添加额外换行符