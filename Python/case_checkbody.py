temperature=37.5
print("你的体温是:",temperature,end=' ')
print("God cho1sin")
print(type(temperature))
if temperature<36:
    print("非正常体温")
else: 
    print("超正常体温")

def checkbody(temper):
    if temper<36:
        print("奇才")
    else: 
        print("全才")
checkbody(37)