
'''
	吃鱼

	题目描述
	小田非常喜欢吃鱼，特别喜欢煎着吃。有一天她抓到了 n 条鱼，她有一个煎锅，每次可以同时煎 m 条鱼。这个煎锅可以花一分钟的时间煎熟鱼的一面，当一条鱼的两面都煎熟了它就可以吃了。现在她想知道最少需要花多少时间能够把所有的鱼都煎熟。


	输入描述:
	第一行包含两个整数𝑛, 𝑚。1 ≤ 𝑛, 𝑚 ≤ 500
	输出描述:
	输出对应的答案。
	示例1
	输入
	复制
	3 2
	输出
	复制
	3
	说明
	示例2
	输入
	复制
	4 2
	输出
	复制
	4
'''

nums = list(map(int, input().split(' ')))
n = nums[0]*2
m = nums[1]
if n<=m:
    print(2)
else:
    if n%m==0:
        print(int(n/m))
    else:
        print(int(n/m)+1)