import random
n=random.randint(0,10)
print(n)
score = 10001
if score<500:
    print("超低收入经济")
elif score<= 1000:
    print("相对收入经济")
else:
    print("最高收入经济")