package BigComp_2018;

/*
	��Ŀ����
	С�׽�n�����Ӱڷ���һ�����޴�������ϡ���i�����ӷ��ڵ�x[i]��y[i]�С�ͬһ������������ö�����ӡ�ÿһ�β���С�׿��԰�һ���������𲢽����ƶ���ԭ���ӵ��ϡ��¡����ҵ�����һ�������С�С����֪��Ҫ�������ϳ�����һ��������������i(1 �� i �� n)����������Ҫ�����ٲ�������.
	��������:
	�����������,��һ��һ������n(1 �� n �� 50),��ʾ���ӵĸ���
	�ڶ���Ϊn�����ӵĺ�����x[i](1 �� x[i] �� 10^9)
	������Ϊn�����ӵ�������y[i](1 �� y[i] �� 10^9)
	�������:
	���n������,��i����ʾ��������һ������������i����������Ҫ�Ĳ�����,�Կո�ָ��ĩ�޿ո�

	��������ʾ:
	����1������: ����Ҫ����
	����2������: ��ǰ�������ӷ���(1, 1)��
	����3������: ��ǰ�������ӷ���(2, 1)��
	����4������: ���������Ӷ�����(3, 1)��
	ʾ��1
	����
	4
	1 2 4 9
	1 1 1 1
	���
	0 1 3 10
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class pileChess{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String[] str = br.readLine().split(" ");
        String[] str2 = br.readLine().split(" ");
        int len = str.length;
        int[] xs = new int[len];
        int[] ys = new int[len];
        int[] distance = new int[len];
        int[] result = new int[len];
        for(int i = 0;i < len;i++){
            xs[i] = Integer.parseInt(str[i]);
            ys[i] = Integer.parseInt(str2[i]);
            result[i] = Integer.MAX_VALUE;
        }
 
        for(int i = 0;i<len;i++){
            for(int j = 0;j<len;j++){
                for(int k = 0;k<len;k++){
                    distance[k] = Math.abs(xs[k] - xs[i]) + Math.abs(ys[k] - ys[j]);
                }
                Arrays.sort(distance);
                int temp = 0;
                for(int m = 0;m<len;m++){
                    temp += distance[m];
                    result[m] = Math.min(result[m], temp);
                }
            }
        }
        for(int i = 0;i<len-1;i++)
            System.out.print(result[i]+" ");
        System.out.print(result[len-1]);
         
    }
     
}