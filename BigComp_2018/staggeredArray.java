package BigComp_2018;

/*
	��������

	��Ŀ����
	 ���Ƕ���һ�������� 0 �� 1 ��ɵ������ǽ������У����ҽ�������������� 0 �� 1 ������ ���ֵģ����磬0��010��10101 ���ǽ������С�
	���ڸ�����һ�������� 0 �� 1 ��ɵ�����??�������ܲ���һ���������У���������Դ���� ������ѡ��һЩ���ֳ�����������������??��ԭ�е����˳������(��ѡȡ??��һ��������)�� ʹ�������õ�����һ���������С��������ܵõ��Ľ������е�������Ƕ��١�

					
				
			
	��������:
	��һ�а���һ������??����ʾ�������еĳ��ȡ�1 �� ?? �� 105
	�ڶ��а���??�� 0 �� 1����ʾ��Ӧ�����С�
					
				
			
	�������:
	����ܹ��õ�����������еĳ��ȡ�
	ʾ��1
	����
	����
	3
	0 1 0
	���
	����
	3
	˵��
	ʾ��2
	����
	����
	8
	1 1 0 0 1 1 0 0
	���
	����
	4
 */

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        if(n <= 1){
            System.out.println(n);
            return;
        }
        String[] s = bf.readLine().split(" ");
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = Integer.parseInt(s[i]);
        }
        int first = nums[0];
        int count = 1;
        for(int i=1; i<n; i++){
            if(first != nums[i]){
                count++;
                first = nums[i];
            }
        }
        System.out.println(count);
    }
}
