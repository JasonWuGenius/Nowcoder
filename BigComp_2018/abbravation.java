package BigComp_2018;

/*
	��д

	��Ŀ����
	��Ӣ����,���ǻ��һЩ�������ֻ��߶��������д������"looks good to me"��дΪ"lgtm",�����е�ÿ�����ʵ�����ĸ�����д�����ڸ���һ���ַ���s,�ַ���s�а���һ�����߶������,����֮���Կո�ָ�,���������ַ�������д��
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
 */

import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] s = bf.readLine().split(" ");
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<s.length; i++){
            sb.append(s[i].charAt(0));
        }
        System.out.println(sb);
    }
}
