package BigComp_2018;

/*
	��Ŀ����
	ţţ��4��ľ��,���ȷֱ�Ϊa,b,c,d��������ṩ�ı�ľ�����ȵķ���,���ţţ֧��һ��Ӳ�ҾͿ�����һ��ľ���ĳ��ȼ�һ���߼�һ��ţţ��Ҫ�����ĸ�ľ��ƴ��һ�������γ���,ţţ������Ҫ֧������Ӳ�Ҳ��������ĸ�ľ��ƴ�ճ������Ρ�
	��������:
	�������һ��,�ĸ�����a,b,c,d(1 �� a,b,c,d �� 10^6), �Կո�ָ�
	�������:
	���һ������,��ʾţţ������Ҫ֧����Ӳ��
	ʾ��1
	����
	����
	4 1 5 4
	���
	����
	4
 */

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
public class pieceSquare{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] s = bf.readLine().split(" ");
        int[] nums = new int[s.length];
        for(int i=0; i<s.length; i++){
            nums[i] = Integer.parseInt(s[i]); 
        }
        Arrays.sort(nums);
        int money = nums[3] - nums[0] + nums[2] - nums[1];
        System.out.print(money);
    }
}
