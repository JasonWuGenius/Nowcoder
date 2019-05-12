package BigComp_2018;

/*
	��Ŀ����
	ţţ����ʦ������һ������Ķ���:����x �� y,[x, y]��ʾx��y֮��(����x��y)�����������������ϡ�����[3,3] = {3}, [4,7] = {4,5,6,7}.ţţ������һ������Ϊn�ĵ�������,ţţ��֪����Ҫ���ٸ����䲢��������������С�
	����:
	{1,2,3,4,5,6,7,8,9,10}����ֻ��Ҫ[1,10]��һ������
	{1,3,5,6,7}����ֻ��Ҫ[1,1],[3,3],[5,7]����������
	��������:
	�����������,��һ��һ������n(1 �� n �� 50),
	�ڶ���n������a[i](1 �� a[i] �� 50),��ʾţţ������,��֤�����ǵ����ġ�
	�������:
	���һ������,��ʾ�������������
	ʾ��1
	����
	����
	5
	1 3 5 6 7
	���
	����
	3
 */
 
 
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
public class regionCount{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        String[] s = bf.readLine().split(" ");
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = Integer.parseInt(s[i]);
        }
        System.out.println(regionCount(n, nums));
    }
    public static int regionCount(int n, int[] nums){
        if(n == 1){
            return 1;
        }
        int count = 0;
        for(int i=1; i<n; i++){
            if(nums[i]-nums[i-1] != 1){
                count++;
            }
            if(i == n-1){
                count++;
            }
        }
        return count;
    }
}
