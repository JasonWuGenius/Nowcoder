package BigComp_2018;

/*
	��λ����

	��Ŀ����
	ţţ��һ��������x,ţţ��Ҫ������x�е���λ�������ŵõ�һ������(��ͬ��x����),ţţ��֪����������Ƿ������ԭx�ı������������������������⡣
	��������:
	�������t+1��,��һ�а���һ������t(1 �� t �� 10),
	������t��,ÿ��һ������x(1 �� x �� 10^6)
	�������:
	����ÿ��x,�����������֮���Ϊ�Լ��ı������"Possible", �������"Impossible".
	ʾ��1
	����
	����
	2
	14
	1035
	���
	����
	Impossible
	Possible
 */

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        for(int i=0; i<n; i++){
            int num = Integer.parseInt(bf.readLine());
            System.out.println(judge(num));
        }
    }
    public static String judge(int num){
        for(int i=2; i<10; i++){
            char[] num1 = String.valueOf(num*i).toCharArray();
            char[] num2 = String.valueOf(num).toCharArray();
            Arrays.sort(num1);
            Arrays.sort(num2);
            if(Arrays.equals(num1, num2)){
                return "Possible";
            }
        }
        return "Impossible";
    }
}
