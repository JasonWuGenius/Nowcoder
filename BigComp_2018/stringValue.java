package BigComp_2018;

/*
	��Ŀ����
	��һ����Ȥ���ַ�����ֵ���㷽ʽ:ͳ���ַ�����ÿ���ַ����ֵĴ���,Ȼ���������ַ�������ƽ������Ϊ�ַ����ļ�ֵ
	����: �ַ���"abacaba",�������4��'a',2��'b',1��'c',��������ַ����ļ�ֵΪ4 * 4 + 2 * 2 + 1 * 1 = 21
	ţţ��һ���ַ���s,�����������s���Ƴ����k���ַ�,���Ŀ�����õõ����ַ����ļ�ֵ��С��
	��������:
	�����������,��һ��һ���ַ���s,�ַ���s�ĳ���length(1 �� length �� 50),����ֻ����Сд��ĸ('a'-'z')��
	�ڶ��а���һ������k(0 �� k �� length),�������Ƴ����ַ�������
	�������:
	���һ������,��ʾ�õ�����С��ֵ
	ʾ��1
	����
	aba
	1
	���
	2
 */

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        int k = Integer.parseInt(bf.readLine());
        int[] nums = new int[26];
        for(char c: s.toCharArray()){
            nums[c-'a']++;
        }
        for(int i=0; i<k; i++){
            int maxId = 0;
            for(int j=0; j<26; j++){
                if(nums[j] > nums[maxId]){
                    maxId = j;
                }
            }
            nums[maxId]--;
        }
        int res = 0;
        for(int i=0; i<26; i++){
            res += Math.pow(nums[i], 2);
        }
        System.out.println(res);
    }
}
