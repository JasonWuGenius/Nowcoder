package BigComp_2018;

/*
	��ţ���

	��Ŀ����
	ţţ����nֻ��ţ,ţţ���ÿֻ��ţ���,�����Ϳ�������׾ٵطֱ������ˡ� ÿ����ţ�������ֶ����Լ���ϲ��,��iֻ��ţ��Ҫһ��1��x[i]֮�������(���а���1��x[i])��
	ţţ��Ҫ����������ţ��ϲ��,�����ţţ����ţţ�ж����ָ���ţ��ŵķ���,�������Ҫ��ı�ŷ���������
	��������:
	�����������,��һ��һ������n(1 �� n �� 50),��ʾ��ţ������ �ڶ���Ϊn������x[i](1 �� x[i] �� 1000)
	�������:
	���һ������,��ʾţţ������������ţ��ϲ���ϱ�ŵķ���������Ϊ�𰸿��ܴܺ�,�����������1,000,000,007��ģ��
	ʾ��1
	����
	����
	4
	4 4 4 4
	���
	����
	24
 */

import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        String[] s = bf.readLine().split(" ");
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = Integer.parseInt(s[i]);
        }
        long max = 1000000007;
        long res = 1;
        Arrays.sort(nums);
        for(int i=0; i<n; i++){
            res = (res*(nums[i]-i))%max;
        }
        System.out.println(res);
    }
}
