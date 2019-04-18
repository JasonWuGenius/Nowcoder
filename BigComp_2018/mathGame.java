package BigComp_2018;

/*
	��Ŀ����
	ţţ�ٰ���һ��������Ϸ,��n����Ҳμ������Ϸ,��Ϸ��ʼÿ�����ѡ��һ����,Ȼ�������д��ֽ��(ʮ������,��ǰ׺��),Ȼ�����������ÿһ�����ֽ�����λ���շǵݼ�˳������,�õ��µ���,������ǰ׺�㽫�����ԡ��õ�������ֵ����Ӯ�������Ϸ��
	��������:
	�����������,��һ�а���һ������n(1 �� n �� 50),����ҵ�����
	�ڶ���n������x[i](0 �� x[i] �� 100000),��ÿ�����д�µ�������
	�������:
	���һ������,��ʾӮ����Ϸ���Ǹ���һ�õ���������Ƕ��١�
	ʾ��1
	����
	����
	3
	9638 8210 331
	���
	����
	3689
 */

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        String[] s = bf.readLine().split(" ");
        System.out.println(getMax(n, s));
    }
    public static int getMax(int n, String[] s){
        int l=0, k=0;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            char[] c = s[i].toCharArray();
            Arrays.sort(c);
            for(int j=0; j<c.length; j++){
                sb.append(c[j]);
            }
            k = Integer.parseInt(sb.toString());
            if(l < k){
                l = k;
            }
            sb.setLength(0);
        }
        return l;
    }
}
