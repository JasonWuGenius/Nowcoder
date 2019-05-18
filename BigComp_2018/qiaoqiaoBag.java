package BigComp_2018;

/*
	���ǵİ�

	��Ŀ����
	�h�h������һ�����������������Ķ���Ҫ�ŵ����ǵİ����棬���ǰ��Ĵ�С���ޣ���������ֻ�ܹ����������ǳ���Ҫ����Ʒ�����ڸ���������Ʒ���������������ֵ����ֵ��ϣ�����ܹ����������ʹ�����ļ�ֵ������Ϸ�ʽ��������������ֵ�����ǻ�ǳ���л�㡣

	��������:
	��1����2����������Ʒ����n�ͱ���װ�����v��

	��2�е�i+1��ÿ��3��������Ϊ��i����Ʒ������m�����w����ֵs��
	�������:
	������һ����������Ϊ���õ���������Ʒ��ֵ�ܺ͡�
	ʾ��1
	����
	����
	2 10
	3 4 3
	2 2 5
	���
	����
	13
	˵��
	ѡ��һ��һ�����ڶ������������Ϊ3x1+5x2=13��
	��ע:
	1��v��500

	1��n��2000

	1��m��10

	1��w��20

	1��s��100
 */

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] str1 = bf.readLine().split(" ");
        int n = Integer.parseInt(str1[0]);
        int v = Integer.parseInt(str1[1]);
        int[] m = new int[n];
        int[] w = new int[n];
        int[] s = new int[n];
        for(int i=0; i<n; i++){
            String[] str2 = bf.readLine().split(" ");
            m[i] = Integer.parseInt(str2[0]);
            w[i] = Integer.parseInt(str2[1]);
            s[i] = Integer.parseInt(str2[2]);
        }
        int[] memo = new int[v+1];
        for(int i=0; i<n; i++){
            for(int j=v; j>=w[i]; j--){
                for(int k=1; k<=m[i] && j>=k*w[i]; k++){
                    int temp = k*s[i]+memo[j-k*w[i]];
                    if(memo[j]<temp){
                        memo[j] = temp;
                    }
                }
            }
        }
        System.out.println(memo[v]);
    }
}
