package BigComp_2018;

/*
	��Ŀ����
	���һ��01��������������λ�õ��ַ����ǲ�һ����,���Ǿͽ����01��Ϊ����01��������: "1","10101","0101010"���ǽ���01����
	С��������һ��01��s,С�����ҳ�һ����������Ӵ�,��������Ӵ���һ������01����С����Ҫ����æ�������������Ӵ��ĳ����Ƕ��١�
	��������:
	��������ַ���s,s�ĳ���length(1 �� length �� 50),�ַ�����ֻ����'0'��'1'
	�������:
	���һ������,��ʾ�������Ҫ����Ӵ����ȡ�
	ʾ��1
	����
	111101111
	���
	3
 */

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
public class cross01String{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        int max = 0;
        int res = 1;
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i) != s.charAt(i-1)){
                res++;
            }
            else{
                res = 1;
            }
            max = Math.max(max, res);
        }
        System.out.println(max);
    }
}
