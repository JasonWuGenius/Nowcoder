
package BigComp_2018;

/*
	��Ŀ����
	���һ������S����������еĺϷ���i,����S[i + 1] = S[i] + d, �����dҲ�����Ǹ�������,���Ǿͳ�����SΪ�Ȳ����С�
	С��������һ������Ϊn������x,С�����x��Ϊһ���Ȳ����С�С����������������������������λ�õ���ֵ�Ĳ���,���ҽ���������������Ρ�������Щ����ͨ���������ǲ��ܱ�ɵȲ�����,С����Ҫ�б�һ�������Ƿ���ͨ������������ɵȲ�����
	��������:
	�����������,��һ�а�������n(2 �� n �� 50),�����еĳ��ȡ�
	�ڶ���n��Ԫ��x[i](0 �� x[i] �� 1000),�������е�ÿ��������
	�������:
	������Ա�ɵȲ��������"Possible",�������"Impossible"��
	ʾ��1
	����
	����
	3
	3 1 2
	���
	����
	Possible
 */
 
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
public class denChaArr{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        String[] s = bf.readLine().split(" ");
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = Integer.parseInt(s[i]);
        }
        System.out.println(denChaArr(n, nums));
    }
    public static String denChaArr(int n, int[] nums){
        Arrays.sort(nums);
        int d = nums[1] - nums[0];
        for(int i=1; i<n; i++){
            if(nums[i] - nums[i-1] != d){
                return "Impossible";
            }
        }
        return "Possible";
    }
}

