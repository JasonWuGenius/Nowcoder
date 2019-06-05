
'''
	字符串连连看

	题目描述
	对于输入的字符串，从左到右扫描字符串，如果存在由三个以上（包括三个）连续相同字符组成的子串，就将这个子串从原串中去掉，并将原有字符串剩下的部分拼接到一起。重复上述过程，直到无法去掉任何子串
	输入描述:
	输入的字符串
	输出描述:
	最后剩下的子串
	示例1
	输入
	复制
	AAABCCDDDCB
	输出
	复制
	BB
'''

s = input()
while True:
    flag = False
    for i in range(0, len(s)-2):
#         print(i, s[i])
        if s[i] == s[i+1] == s[i+2]:
            s = s[0:i]+s[i+3:]
            flag = True
            break
        if len(s) < 3:
            break
    if flag == False:
        break
print(s)