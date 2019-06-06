
'''
	最小排列


	题目描述
	由数字 1 到 n 组成的一个序列我们称为一个 n 排列。对于两个不同的 n 排列𝐴 = 𝑎1𝑎2 ... 𝑎𝑛和 𝐵 = 𝑏1𝑏2 ... 𝑏𝑛我们可以按字典序比较他们的大小:从前往后找到第一个两个排列中数字不同 的位置，即找到一个位置𝑝使得𝑎1 = 𝑏1, 𝑎2 = 𝑏2, ... , 𝑎𝑝−1 = 𝑏𝑝−1, 𝑎𝑝 ≠ 𝑏𝑝，若𝑎𝑝 < 𝑏𝑝，我们 则称排列𝐴小于排列𝐵，反之则𝐴大于𝐵。现在给出一个 n 排列，你需要选择排列中的两个不同的位置，然后交换这两个位置的数字， 你需要使得最后得到的排列尽量小。注意你必须进行一次且只能进行一次操作。        
	输入描述:
	第一行包含一个数字𝑛，表示排列的长度。2 ≤ 𝑛 ≤ 105
	第二行包含𝑛个数字构成一个𝑛排列。     
	输出描述:
	输出一个 n 排列，表示能得到的最小的排列。
	示例1
	输入
	复制
	3
	3 2 1
	输出
	复制
	1 2 3
	说明
	示例2
	输入
	复制
	4
	2 1 4 3
	输出
	复制
	1 2 4 3
'''

n = int(input())
values = list(map(int, input().split()))
#n = 3
#values = [3, 2, 1]

def swap(values, i, j):
    temp = values[i]
    values[i] = values[j]
    values[j] = temp
    return values
    
for i in range(n):
    if values[i] > i+1:
        values = swap(values, i, values.index(i+1))
        break
    if i == n-1:
        values = swap(values, n-2, n-1)
        
print(" ".join(str(i) for i in values))