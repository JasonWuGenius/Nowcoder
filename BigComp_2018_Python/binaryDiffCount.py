
'''
	两个整数二进制位不同个数

	题目描述
	输入两个整数，求两个整数二进制格式有多少个位不同
	输入描述:
	两个整数
	输出描述:
	二进制不同位的个数
	示例1
	输入
	复制
	22 33
	输出
	复制
	5
'''
# s = [22, 33]
s = list(map(int, input().split()))
a = [_ for _ in bin(s[0]).replace('0b', '')][::-1]
b = [_ for _ in bin(s[1]).replace('0b', '')][::-1]
# print(a, b)
count = 0 
maxlen = max(len(a), len(b))
minlen = min(len(a), len(b))
big = 0
if len(a)>len(b):
    big = a
else:
    big = b
for i in range(minlen):
    if a[i] != b[i]:
        count += 1
for i in range(minlen, maxlen):
    if big[i] == '1':
        count+=1
print(count)