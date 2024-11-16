def http_error(status):
    match status:
        case 400:
            return "Bad request"
        case 404:
            return "Not found"
        case 418:
            return "I'm a teapot"
        case _:
            return "Something's wrong with the internet"
mystatus=404
print(http_error(mystatus))      
# 吾十有五而志于学，三十，四十而不惑，五十而知天命，六十而耳顺，七十而从心所欲，不逾矩
def getAge_time(age):
    match age:
        case 15:
            print("志于学")
        case 30:
            print("而立")
        case 40:
            print("不惑")
        case 50:
            print("知天命")
        case 60:
            print("耳顺")
        case 70:
            print("从心所欲")
# 请输入你的年龄
input_age=15
getAge_time(input_age)
