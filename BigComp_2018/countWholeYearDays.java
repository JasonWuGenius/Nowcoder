package BigComp_2018;

/*
	����һ���еĵڼ���

	��Ŀ����
	����ĵڼ��죿

	�����ꡢ�¡��գ���������Ǳ���ĵڼ��졣

	��������:
	��������������(1<=Y<=3000)����(1<=M<=12)����(1<=D<=31)��
	�������:
	��������ж���������ݣ�����ÿһ��������ݣ�
	���һ������������Input�е��ꡢ�¡��ն�Ӧ����ĵڼ��졣
	ʾ��1
	����
	����
	1990 9 20
	2000 5 1
	���
	����
	263
	122
 */

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] s = bf.readLine().split(" ");
        int[] nums = new int[s.length];
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        int sum = 0;
        for(int i=0; i<s.length; i++){
            nums[i] = Integer.parseInt(s[i]);
        }
        if(nums[0]%4==0 && nums[0]!=0 || nums[0]%400==0){
            for(int j=0; j<(nums[1]-1); j++){
                sum += days[j];
            }
            sum = sum+nums[2]+1;
            System.out.println(sum);
        }
        else{
            for(int k=0; k<(nums[1]-1); k++){
                sum += days[k];
            }
            sum = sum+nums[2];
            System.out.println(sum);
        }
    }
}
