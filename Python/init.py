class Person:
    # 构造器 初始化变量 self
    def __init__(self, name, age):
        self.name = name
        self.age = age
        print("这是__init__构造器")
        print(self.name + str(self.age))  # 将 age 转换为字符串
        print(f"年龄: {self.age},名字: {self.name}")
    def display_info(self):
        print("这是方法打印参数")
        # 还不会
        print(f"Name: {self.name}, Age: {self.age}")   
# 创建对象
person = Person("刘紫柯", 22)
person.display_info()