package BigComp_2018;

/*
	��Ŀ����
	ţţ��һ������Ϊn����������,ţţ���������н�������Ϊһ�����ϸ��������С�ţţ�Ƚ�����,�����ƶ������ٵ������������,�����������һ����������Ҫ�ƶ����ٸ������е�Ԫ�ء�(��һ��Ԫ�ز�����ԭ�����ڵ�λ��,���Ԫ�ؾ��Ǳ��ƶ��˵�)
	��������:
	�����������,��һ��һ������n(1 �� n �� 50),�����еĳ���
	�ڶ���n������x[i](1 �� x[i] �� 100),�������е�ÿ����
	�������:
	���һ������,��������Ҫ�ƶ���Ԫ�ظ���
	ʾ��1
	����
	3
	3 2 1
	���
	2

 */
 
//���⼼�����ڽ�ԭ�����������󣬽��������ԭ����ĸ�λ�ý��бȽϣ��������ͬ���������ƶ�������1
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        String[] s = bf.readLine().split(" ");
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = Integer.parseInt(s[i]);
        }
        int res = minMove(nums, n);
        System.out.println(minMove(nums, n));
    }
    public static int minMove(int[] nums, int n){
        int[] y = new int[n];
        int count = 0;
        y = nums.clone();
        Arrays.sort(y);
        for(int i=0; i<n; i++){
            if(nums[i] != y[i]){
                count++;
            }
        }
        return count;
    }
}
