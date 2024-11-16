import re
pattern = re.compile(r"\d+")                    # 用于匹配至少一个数字
m = pattern.match("12345aa566777")        # 查找头部，没有匹配
if m:
    print(m.group())
    print("匹配成功")
else:
    print("匹配失败")
    
matches = pattern.finditer("12345aa566777")
for m in matches:
    print(m.group())

pattern = re.compile(r"\d+")
matches = pattern.findall("12345aa566777")
print(matches)