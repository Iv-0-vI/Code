def print_kwargs(**kwargs):#!!
    for key, value in kwargs.items():
        print(f"{key}: {value}")
print_kwargs(name="Kimi", age=2, goal=60)#key=value n个键值对