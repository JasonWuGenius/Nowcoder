
'''
	��λ����

	��Ŀ����
	ţţ��һ��������x,ţţ��Ҫ������x�е���λ�������ŵõ�һ������(��ͬ��x����),ţţ��֪����������Ƿ������ԭx�ı������������������������⡣
	��������:
	�������t+1��,��һ�а���һ������t(1 �� t �� 10),
	������t��,ÿ��һ������x(1 �� x �� 10^6)
	�������:
	����ÿ��x,�����������֮���Ϊ�Լ��ı������"Possible", �������"Impossible".
	ʾ��1
	����
	����
	2
	14
	1035
	���
	����
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