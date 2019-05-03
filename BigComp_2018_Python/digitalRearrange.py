
'''
	数位重排

	题目描述
	牛牛有一个正整数x,牛牛需要把数字x中的数位进行重排得到一个新数(不同于x的数),牛牛想知道这个新数是否可能是原x的倍数。请你来帮他解决这个问题。
	输入描述:
	输入包括t+1行,第一行包括一个整数t(1 ≤ t ≤ 10),
	接下来t行,每行一个整数x(1 ≤ x ≤ 10^6)
	输出描述:
	对于每个x,如果可能重排之后变为自己的倍数输出"Possible", 否则输出"Impossible".
	示例1
	输入
	复制
	2
	14
	1035
	输出
	复制
	Impossible
	Possible
'''

def judge(num):
    for i in range(2,10):
        if sorted(str(num)) == sorted(str(num*i)):
            return 'Possible'
    return 'Impossible'
n = int(input())
for i in range(n):
    print(judge(int(input())))