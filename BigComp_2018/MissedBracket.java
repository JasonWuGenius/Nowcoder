package BigComp_2018;

/*
	ȱʧ������

	��Ŀ����
	һ�������������ַ��������������:
	1�����ַ����������ġ�
	2�����s���������ַ�������ô(s)Ҳ�������ġ�
	3�����s��t���������ַ��������������������γɵ�stҲ�������ġ�
	���磬"(()())", ""��"(())()"�������������ַ�����"())(", "()(" �� ")"�ǲ������������ַ�����
	ţţ��һ�������ַ���s,������Ҫ����������λ�þ����ٵ��������,����ת��Ϊһ�������������ַ���������ţţ������Ҫ��Ӷ��ٸ����š�
	��������:
	�������һ��,һ����������s,���г���length(1 �� length �� 50).
	s��ÿ���ַ����������Ż���������,��'('����')'.
	�������:
	���һ������,��ʾ������Ҫ��ӵ�������
	ʾ��1
	����
	����
	(()(()
	���
	����
	2
 */

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
public class missedBracket{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        System.out.println(getMinAddBracketNum(s));
    }
    private static int getMinAddBracketNum(String s){
        int sum = 0, num = 0;
        char[] c = s.toCharArray();
        for(int i=0; i<c.length; i++){
            if(c[i] == '('){
                sum++;
            }
            else{
                sum--;
            }
            if(sum<0){
                num++;
                sum++;
            }
        }
        return sum+num;
    }
}
