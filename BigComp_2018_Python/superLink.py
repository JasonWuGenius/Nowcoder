
'''
	超链接

	题目描述

	输入描述:

	输出描述:

	示例1
	输入
	复制
	5
	sina
	qq
	taobao
	jd
	baidu
	3
	qq
	baidu
	baidu
	输出
	复制
	jd
	sina
	taobao
'''

n = int(input())
link = []
for i in range(n):
    link.append(input())
m = int(input())
clicked = []
for i in range(m):
    clicked.append(input())
    
    
clicked = list(set(clicked))
link.sort()
for item in link:
    if item not in clicked:
        print(item)