package BigComp_2018;

/*
	����

	��Ŀ����
	С��ǳ�ϲ�����㣬�ر�ϲ�����ųԡ���һ����ץ���� n ���㣬����һ�������ÿ�ο���ͬʱ�� m ���㡣���������Ի�һ���ӵ�ʱ��������һ�棬��һ��������涼���������Ϳ��Գ��ˡ���������֪��������Ҫ������ʱ���ܹ������е��㶼���졣


	��������:
	��һ�а�����������??, ??��1 �� ??, ?? �� 500
	�������:
	�����Ӧ�Ĵ𰸡�
	ʾ��1
	����
	����
	3 2
	���
	����
	3
	˵��
	ʾ��2
	����
	����
	4 2
	���
	����
	4
 */

import java.util.*;
import java.io.*;

public class eatFish{
    public static void main (String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] s = bf.readLine().split(" ");
        int n = Integer.parseInt(s[0])*2;
        int m = Integer.parseInt(s[1]);
        if(m >= n){
            System.out.println(2);
        }
        else{
            if(n%m == 0){
                System.out.println(n/m);
            }
            else{
                System.out.println(n/m+1);
            }
        }
    }
}