package BigComp_2018;

/*
	�����ظ��ַ�������
	
	��Ŀ����
	����ַ������ҳ������ظ�һ�ε����ַ�������󳤶�
	��������:
	�ַ��������Ȳ�����1000
	�������:
	�ظ��Ӵ��ĳ��ȣ����������0
	ʾ��1
	����
	����
	ababcdabcefsgg
	���
	����
	3
	˵��
	abcΪ�ظ�������Ӵ�������Ϊ3
 */

import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        int length = s.length();
        int max_count = 0;
        for(int i=0; i<length; i++){
            for(int j=i+1; j<length; j++){
                int idx_i = i;
                int idx_j = j;
                int count = 0;
                while(idx_i < length && idx_j < length && s.charAt(idx_i) == s.charAt(idx_j)){
                    idx_i += 1;
                    idx_j += 1;
                    count += 1;
                }
                max_count = count > max_count? count : max_count;
            }
        }
        System.out.println(max_count);
    }
}
