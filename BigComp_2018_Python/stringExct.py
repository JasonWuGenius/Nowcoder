
'''
	字符串提取

	题目描述
	请从字符串中提取以最后一个[img]开头、以最后一个[\img]结尾的字符串，未找到匹配的字符串返回"null"
	输入描述:
	可能包含[img][\img]的字符串
	输出描述:
	截取后的字符串
	示例1
	输入
	复制
	bbb[img]ccc[img]ddd[\img]eee[\img]
	输出
	复制
	[img]ddd[\img]eee[\img]
	说明
	示例2
	输入
	复制
	abc
	输出
	复制
	null
'''

# s = 'bbb[img]ccc[img]ddd[\img]eee[\img]'
# s = 'abc'
s = input()
def stringExct(s):
    if len(s)<11:
        return 'null'
    begin = 0
    end = 0
    i = 0
    while i+5<len(s):
#         print('s[{}:{}]'.format(i, i+5))
        if '[img]' == s[i:i+5]:
            begin = i
        if '[\img]' == s[i:i+6]:
            end = i
        i+=1
    if begin < end:
        return s[begin:end+6]
    else:
        return 'null'
print(stringExct(s))