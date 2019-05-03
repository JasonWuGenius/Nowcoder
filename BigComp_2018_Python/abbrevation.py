
'''
	缩写

	输入描述:
	输入包括一个字符串s,字符串长度length(1 ≤ length ≤ 50),字符串中只包括小写字母('a'~'z')和空格。
	输出描述:
	输出一个字符串,即缩写的结果。
	示例1
	输入
	复制
	looks good to me
	输出
	复制
	lgtm

'''

s = input().split()
res = ''
for i in range(len(s)):
    res += s[i][0]
print(res)