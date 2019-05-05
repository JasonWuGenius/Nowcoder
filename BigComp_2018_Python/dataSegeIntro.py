
'''
	数据分页说明

	题目描述
	数据分页,对于指定的页数和每页的元素个数，返回该页应该显示的数据。
	输入描述:
	第一行输入数据个数，第二行全部数据，第三行输入页数，第四行输入每页最大数据个数
	输出描述:
	输出该页应该显示的数据，超出范围请输出'超过分页范围'
	示例1
	输入
	复制
	6
	1 2 3 4 5 6
	1
	2
	输出
	复制
	3
	4
'''

n = int(input())
pages = list(map(int, input().split()))
cur = int(input())
r = int(input())

if cur*r>=n:
    print('超出分页范围')
else:
    for i in range(cur*r, cur*r+r, 1):
        print(pages[i])
