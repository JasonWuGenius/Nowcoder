package BigComp_2018;

/*
	��Ŀ����
	С����һ������Ϊn����������,a_1,...,a_n��Ȼ������һ��������b�Ͻ���n�����²���:
	1����a_i����b���е�ĩβ
	2������b����
	С����Ҫ������������n��֮���b���С�
	��������:
	�����������,��һ�а���һ������n(2 �� n �� 2*10^5),�����еĳ��ȡ�
	�ڶ��а���n������a_i(1 �� a_i �� 10^9),������a�е�ÿ������,�Կո�ָ
	�������:
	��һ�����������n��֮���b����,�Կո�ָ�,��ĩ�޿ո�
	ʾ��1
	����
	4
	1 2 3 4
	���
	4 2 1 3

 */
	
//�Լ�д�ķ�����ʱ����������
import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        String[] str = bf.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=n-1; i>=0; i-=2){
            sb.append(str[i]).append(" ");
        }
        for(int i=(n%2 == 0? 0:1); i<n; i+=2){
            sb.append(str[i]).append(" ");
        }
        System.out.println(sb.substring(0,sb.length()-1));
    }
}
