package BigComp_2018;

/*
	��Ŀ����
	ţţ�μ���һ������,���԰���n���ж���,ÿ����һ������1��,ţţ����ǰ��ȫû��׼��,���Կ���ֻ�ܿ�Ե����,ţţ�ڿ�����һ���²���t����Ŀ�Ĵ���"��ȷ",������ţţ��Ϊ"����"�����Խ�����ţţ֪��ʵ����n��������a����Ŀ�Ĵ�Ӧ����"��ȷ",����ţţ��֪����������Щ��Ŀ,ţţϣ�����ܰ�����������ܻ�õ���ߵĿ��Է����Ƕ��١�
	��������:
	�������һ��,һ����������������n, t, a(1 �� n, t, a �� 50), �Կո�ָ�
	�������:
	���һ������,��ʾţţ���ܻ�õ���߷��Ƕ��١�
	ʾ��1
	����
	3 1 2
	���
	2
 */

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class judgementQuestion{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = br.readLine().split(" ");
        int n = Integer.parseInt(strs[0]);
        int t = Integer.parseInt(strs[1]);
        int a = Integer.parseInt(strs[2]);
        System.out.println(n-Math.abs(a-t));
    }
}