
'''
	��д

	��������:
	�������һ���ַ���s,�ַ�������length(1 �� length �� 50),�ַ�����ֻ����Сд��ĸ('a'~'z')�Ϳո�
	�������:
	���һ���ַ���,����д�Ľ����
	ʾ��1
	����
	����
	looks good to me
	���
	����
	lgtm

'''

s = input().split()
res = ''
for i in range(len(s)):
    res += s[i][0]
print(res)