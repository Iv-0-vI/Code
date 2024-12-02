import re
pattern = re.compile(r"\d{1,}")
string = "123dfnsn23123fefeg"
result = pattern.findall(string)
print(result)