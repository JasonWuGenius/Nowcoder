
'''
	交错序列

	题目描述
	 我们定义一个由数字 0 和 1 组成的序列是交错序列，当且仅当在这个序列中 0 和 1 是轮流 出现的，比如，0，010，10101 都是交错序列。
	现在给出了一个由数字 0 和 1 组成的序列𝐴，它可能不是一个交错序列，但是你可以从这个 序列中选择一些数字出来，按他们在序列𝐴中原有的相对顺序排列(即选取𝐴的一个子序列)， 使得你最后得到的是一个交错序列。问这样能得到的交错序列的最长长度是多少。

					
				
			
	输入描述:
	第一行包含一个整数𝑛，表示输入序列的长度。1 ≤ 𝑛 ≤ 105
	第二行包含𝑛个 0 或 1，表示对应的序列。
					
				
			
	输出描述:
	输出能够得到的最长交错序列的长度。
	示例1
	输入
	复制
	3
	0 1 0
	输出
	复制
	3
	说明
	示例2
	输入
	复制
	8
	1 1 0 0 1 1 0 0
	输出
	复制
	4
'''

n = int(input())
nums = list(map(int, input().split(' ')))

temp = nums[0]
count = 1
for i in range(1,n):
    if temp != nums[i]:
        count += 1
        temp = nums[i]
        
print(count)