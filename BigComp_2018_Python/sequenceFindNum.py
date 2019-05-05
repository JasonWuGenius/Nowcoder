
'''
    序列找数

    题目描述
    从非负整数序列 0, 1, 2, ..., n中给出包含其中n个数的子序列，请找出未出现在该子序列中的那个数。
    输入描述:
    输入为n+1个非负整数，用空格分开。
    其中：首个数字为非负整数序列的最大值n，后面n个数字为子序列中包含的数字。
    输出描述:
    输出为1个数字，即未出现在子序列中的那个数。
    示例1
    输入
    复制
    3 3 0 1
    输出
    复制
    2
'''

nums = list(map(int, input().split(' ')))

n = nums[0]
sum = n*(n+1)/2
for i in range(1, n+1):
    sum -= nums[i]
print(int(sum))