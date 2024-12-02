def init_num():
    print("init_num函数")
    nums=[1,2,3,4,5,6,7,8,9,0]
    for i in nums:
        print(i,end='')
        # print(nums[i])
def check():
    print()
    print("check函数")
    print(1,end='')
    print(2,end='')
    print(3,end='')
if __name__=="__main__":
    init_num()
    check()
