class Person:
    def __init__(self,name,age):
        self.name=name
        self.age=age
        print(f"{self.age}岁的{self.name}")
name = ["刘紫柯","刘一星"]
age = [1,2,3,4,5,6,7,8,9,0]
# 创建对象 主方法
p1=Person("刘一星",3)
print(f"{name[1]}",{age[0]})
