package BigComp_2018;

/*
	���ŵ�ƥ�����

	��Ŀ����
	һ���Ϸ�������ƥ�����������¶���:
	1���մ�""��һ���Ϸ�������ƥ������
	2�����"X"��"Y"���ǺϷ�������ƥ������,"XY"Ҳ��һ���Ϸ�������ƥ������
	3�����"X"��һ���Ϸ�������ƥ������,��ô"(X)"Ҳ��һ���Ϸ�������ƥ������
	4��ÿ���Ϸ����������ж����������Ϲ������ɡ�
	����: "","()","()()","((()))"���ǺϷ�����������
	����һ���Ϸ����������������������¶����������:
	1���մ�""�������0
	2������ַ���"X"�������x,�ַ���"Y"�������y,��ô�ַ���"XY"�����Ϊmax(x,y) 3�����"X"�������x,��ô�ַ���"(X)"�������x+1
	����: "()()()"�������1,"((()))"�������3��ţţ���ڸ���һ���Ϸ�����������,��Ҫ����������ȡ�
	��������:
	�������һ���Ϸ�����������s,s����length(2 �� length �� 50),������ֻ����'('��')'��
	�������:
	���һ��������,��������е���ȡ�
	ʾ��1
	����
	����
	(())
	���
	����
	2
 */

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
public class bracketDepth{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        System.out.println(getDepth(s));
    }
    public static int getDepth(String s){
        char[] c = s.toCharArray();
        int max = 0;
        int num = 0;
        for(int i=0; i<c.length; i++){
            if(c[i] == '('){
                num++;
                max = Math.max(num, max);
            }
            else{
                num--;
            }
        }
        return max;
    }
}
