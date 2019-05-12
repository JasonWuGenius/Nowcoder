
'''
	题目列表

	输入
	复制
	4
	math 100 90
	algorithm 10 8
	string 50 1
	dp 100 50
	输出
	复制
	algorithm 3
	dp 4
	math 3
	string 5
'''

n = int(input())
arr = []
for i in range(n):
    s = input().split()
    diffcult = int(s[2])/int(s[1])
    if diffcult <= 0.3:
        result = '5'
    else:
        if diffcult <= 0.6:
            result = '4'
        else:
            result = '3'
    arr.append(s[0]+' '+result)
for item in sorted(arr):
    print(item)