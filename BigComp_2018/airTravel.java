
package BigComp_2018;

/*
	��Ŀ����
	ţţ�������������������Լ��ķɻ����������ǽ��м��������ķ��С�f[i]��ʾ��i�η��������ȼ�͵�����������ֻ�ܰ���f������������˳����С�
	����ɻ�����s��ȼ��,Ϊ����������,ÿ�η���ǰ�ɻ���ȼ����Ӧ���ڵ��ڴ˴���������Ҫ��ȼ��������������Ǽ����ڲ����м��͵�����������ܽ��еķ��д�����
	��������:
	�����������,��һ�а�����������n��s(1 �� n �� 50, 1 �� s �� 1000),�ֱ��ʾ�ƻ����еĴ����ͷ����ʼ״̬���е�ȼ������
	�ڶ��а���n������f[i], (1 �� f[i] �� 1000), ��ʾÿ�μƻ���������Ҫ��ȼ������
	�������:
	���һ������,��ʾ�����ܽ��еķ��д�����
	ʾ��1
	����
	7 10
	1 2 3 4 5 6 7
	���
	4

 */
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = bf.readLine().split(" ");
        int n = Integer.parseInt(nums[0]);
        int s = Integer.parseInt(nums[1]);
        String[] str = bf.readLine().split(" ");
        int[] f = new int[n];
        int count = 0;
        int sum = 0;
        for(int i=0; i<n; i++){
            f[i] = Integer.parseInt(str[i]);
            sum += f[i];
            if(sum <= s){
                count++;
            }
            else{
                break;
            }
        }
        System.out.println(count);
    }
}
