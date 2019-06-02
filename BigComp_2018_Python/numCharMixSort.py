
'''
	字母数字混合排序

	题目描述
	输入一串字符，包含数字[0-9]和小写字母[a-z]，要求按数字从小到大、字母从a到z排序，并且所有数字排在字母后面
	输入描述:
	一串字符
	输出描述:
	按规则排序的一串字符
	示例1
	输入
	复制
	a31bz
	输出
	复制
	abz13
	说明
'''
def mix(nums):
    nums = sorted(nums)
    for i in range(len(nums)):
        if ord(nums[i])<=ord('9'):
            continue
        else:
            n1 = ''.join(nums[i:]+nums[:i])
            print(n1)
            break
nums = input()
mix(nums)