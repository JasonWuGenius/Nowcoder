package BigComp_2018;

/*
	���ݷ�ҳ˵��

	��Ŀ����
	���ݷ�ҳ,����ָ����ҳ����ÿҳ��Ԫ�ظ��������ظ�ҳӦ����ʾ�����ݡ�
	��������:
	��һ���������ݸ������ڶ���ȫ�����ݣ�����������ҳ��������������ÿҳ������ݸ���
	�������:
	�����ҳӦ����ʾ�����ݣ�������Χ�����'������ҳ��Χ'
	ʾ��1
	����
	����
	6
	1 2 3 4 5 6
	1
	2
	���
	����
	3
	4

 */

import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        String[] s = bf.readLine().split(" ");
        int[] pages = new int[n];
        for(int i=0; i<n; i++){
            pages[i] = Integer.parseInt(s[i]);
        }
        int cur = Integer.parseInt(bf.readLine());
        int r = Integer.parseInt(bf.readLine());
        int index = cur*r;
        if(index >= n){
            System.out.println("������ҳ��Χ");
        }
        else{
            for(int i=index; i<index+r; i++){
                System.out.println(pages[i]);
            }
        }
    }
}
