
'''
	走格子游戏


	题目描述
	G社正在开发一个新的战棋类游戏，在这个游戏中，角色只能向2个方向移动：右、下。移动需要消耗行动力，游戏地图上划分M*N个格子，当角色移动到某个格子上时，行动力就会加上格子上的值K（-100~100），当行动力<=0时游戏失败，请问要从地图左上角移动到地图右下角至少需要多少起始行动力，注意（玩家初始化到起始的左上角格子时也需要消耗行动力）
	输入描述:
	第一行输入格子行列数（格式为 M N），第2~M+1行每行输入N个数，作为格子值K，中间以空格分割；0 < M, N < 1000，-100 < K < 100
	输出描述:
	初始最小行动力
	示例1
	输入
	复制
	2 3
	-2 -3 3
	-5 -10 1
	输出
	复制
	6
'''
m, n=map(int, input().split())
matrix=[]
for i in range(m):
    a=[int(i) for i in input().split()]
    matrix.append(a)
def jump(m, n, matrix):
    #dp=n+1
    dp = [[0 for j in range(n+1)] for i in range(m+1)]
    for i in range(m-1,-1,-1):
        for j in range(n-1,-1,-1):
            temp=min(dp[i][j+1],dp[i+1][j])-matrix[i][j]
            dp[i][j]=max(1,temp)
    return dp[0][0]
print(jump(m, n, matrix))