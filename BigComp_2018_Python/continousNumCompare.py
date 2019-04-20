
'''
	题目描述
	对于任意两个正整数x和k,我们定义repeat(x, k)为将x重复写k次形成的数,例如repeat(1234, 3) = 123412341234,repeat(20,2) = 2020.
	牛牛现在给出4个整数x1, k1, x2, k2, 其中v1 = (x1, k1), v2 = (x2, k2),请你来比较v1和v2的大小。
	输入描述:
	输入包括一行,一行中有4个正整数x1, k1, x2, k2(1 ≤ x1,x2 ≤ 10^9, 1 ≤ k1,k2 ≤ 50),以空格分割
	输出描述:
	如果v1小于v2输出"Less",v1等于v2输出"Equal",v1大于v2输出"Greater".
	示例1
	输入
	复制
	1010 3 101010 2
	输出
	复制
	Equal
'''

nums = list(map(int, input().split()))

x1 = ""
k1 = int(nums[1])
x2 = ""
k2 = int(nums[3])


for i in range(k1):
    x1 += str(nums[0])
for i in range(k2):
    x2 += str(nums[2])

if len(x1) > len(x2):
    print("Greater")
elif len(x1) < len(x2):
    print("Less")
else:
    flag = 0
    for i in range(len(x1)):
        if x1[i] > x2[i]:
            flag = 1
            break
        elif x1[i] < x2[i]:
            flag = -1
            break
    if flag == 0:
        print("Equal")
    elif flag == 1:
        print("Greater")
    else:
        print("Less")