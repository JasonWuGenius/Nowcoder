
'''
	图的闭包

	题目描述
	在一张包含𝑛个点的简单图(即没有自环与重边)𝐺中，若对于度数之和𝑑(𝑢) + 𝑑(𝑣) ≥ 𝑛的任意 两个不同的点𝑢, 𝑣，均有𝑢和𝑣是相邻(即有一条边连接)的，那么我们称图𝐺是一张闭图。 现在给出一张简单图，它可能不是闭图，你可以在图中添加一些边使其成为毕图，但是你又 比较懒，所以你想知道最少需要添加多少条边，它才可以成为闭图?
	输入描述:
	第一行包含两个整数𝑛, 𝑚，表示图中的顶点数和边数。1 ≤ 𝑛 ≤ 50，0 ≤ 𝑚 ≤ 𝑛(𝑛−1)
	2

	接下来𝑚行，每行包含两个整数𝑢, 𝑣，表示顶点𝑢和𝑣直接有一条边。1 ≤ 𝑢, 𝑣 ≤ 𝑛
	输出描述:
	输出最少需要添加的边数
	示例1
	输入
	复制
	2 1
	1 2
	输出
	复制
	0
	说明
	示例2
	输入
	复制
	4 4
	1 2
	2 3
	3 4
	4 1
	输出
	复制
	2
'''

n, edge = list(map(int, input().split()))
a = [[0 for i in range(n)] for j in range(n)]
for i in range(edge):
    x, y = [int(i) for i in input().split()]
    a[x-1][y-1] = 1
    a[y-1][x-1] = 1
degree = [sum(a[i]) for i in range(n)]
count = 0
flag = False
while flag == False:
    flag = True
    for i in range(n):
        for j in range(i+1, n):
            if degree[i]+degree[j]>=n and a[i][j]==0:
                a[i][j]=a[j][i]=1
                degree[i]+=1
                degree[j]+=1
                count+=1
                flag=False
print(count)