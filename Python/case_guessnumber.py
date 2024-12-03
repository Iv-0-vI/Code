import random
list=[2333,1234,4321]#声明加函数处理
random_num=random.choice(list)
print(random_num)
while True:
    guess_num=int(input("guess an number:"))
    if guess_num==0000:#!!!!!
        print("exit code=0")
        break
    if guess_num==random_num:
        print("whoa success")
    else:
        print("Oops, wrong")