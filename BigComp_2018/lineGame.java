package BigComp_2018;

/*
	������Ϸ

	��Ŀ����
	ĳһ�죬Alice �Ƚ����ģ�������Ϊ�Լ�������һ����Ϸ�档��������ֽ�ϻ���һ��Բ��Ȼ ������Բ��Բ���Ͼ��ȵ�ȡ�� n ���㣬�� n ���㽫Բ n �ȷ֡���������Alice ÿ�δ��� n ������ѡȡ�����㣬����������֮�仭һ���߶Σ�����Ҫ�������߶β��������е��߶��ཻ (�����ڶ˵㴦�ཻ)��Ϊ���ܴ򷢸����ʱ�䣬Alice ϣ���ܻ���������߶Σ���������� ������ܻ��������߶�?
	��������:
	��һ�а���һ������??����ʾ��Բ����ȡ���ĵ�����2 �� ?? �� 109

	�������:
	�����Ӧ�Ĵ𰸡�
	ʾ��1
	����
	����
	2
	���
	����
	1
	˵��
	ʾ��2
	����
	����
	4
	���
	����
	5
	˵��
 */

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        System.out.println(n+n-3);
    }
}
