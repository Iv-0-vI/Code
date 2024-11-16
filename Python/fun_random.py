import random
random_num=random.random()
print(random_num)
random_int=random.randint(1,9)
print(random_int)

while True:
    random_int=random.randint(0,9)
    print(random_int)
    if random_int == 9:
        break