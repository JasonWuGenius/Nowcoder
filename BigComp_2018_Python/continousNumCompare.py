
'''
	��Ŀ����
	������������������x��k,���Ƕ���repeat(x, k)Ϊ��x�ظ�дk���γɵ���,����repeat(1234, 3) = 123412341234,repeat(20,2) = 2020.
	ţţ���ڸ���4������x1, k1, x2, k2, ����v1 = (x1, k1), v2 = (x2, k2),�������Ƚ�v1��v2�Ĵ�С��
	��������:
	�������һ��,һ������4��������x1, k1, x2, k2(1 �� x1,x2 �� 10^9, 1 �� k1,k2 �� 50),�Կո�ָ�
	�������:
	���v1С��v2���"Less",v1����v2���"Equal",v1����v2���"Greater".
	ʾ��1
	����
	����
	1010 3 101010 2
	���
	����
	Equal
'''

nums = list(map(int, input().split()))

x1 = ""
k1 = int(nums[1])
x2 = ""
k2 = int(nums[3])


for i in range(k1):
    x1 += str(nums[0])
for i in range(k2):
    x2 += str(nums[2])

if len(x1) > len(x2):
    print("Greater")
elif len(x1) < len(x2):
    print("Less")
else:
    flag = 0
    for i in range(len(x1)):
        if x1[i] > x2[i]:
            flag = 1
            break
        elif x1[i] < x2[i]:
            flag = -1
            break
    if flag == 0:
        print("Equal")
    elif flag == 1:
        print("Greater")
    else:
        print("Less")