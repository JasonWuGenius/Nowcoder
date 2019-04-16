package BigComp_2018;

/*
	��Ŀ����
	С����ʦ�Ƿǳ�������,����Ҫ������ѧ���ڽ������ǰ���ų�һ��,������Ҫ��ѧ��������߲��ݼ���˳�����С���һ��,n��ѧ�����жӵ�ʱ��,С����ʦ����ȥ�������ˡ�ѧ���������л��ᷴ����,����ѧ���Ǿ�����һ�η��Ķ���,���Ƕ���һ�����еķ��ֵΪÿ����������ѧ����߲�ľ���ֵ�ܺ͡����ڰ������˳�����еĶ��еķ��ֵ����С��,���ǵ�Ȼ�������շ��ֵ����˳���������жӡ����ڸ���n��ѧ�������,��������Щѧ���жӵ������ܵķ��ֵ��С����ʦ����һ�������ð�����
	��������:
	�����������,��һ��һ������n(1 �� n �� 50),��ʾѧ��������
	�ڶ���Ϊn������h[i](1 �� h[i] �� 1000),��ʾÿ��ѧ�������
	�������:
	���һ������,��ʾn��ѧ���жӿ��Ի�õ����ķ��ֵ��

	��������ʾ: 
	����������˳����: 25-10-40-5-25, ��߲����ֵ���ܺ�Ϊ15+30+35+20=100��
	�������ķ��ֵ�ˡ�
	ʾ��1
	����
	5
	5 10 25 40 25
	���
	100
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.ArrayList;
public class crazyQueue{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] strs = br.readLine().split(" ");
        int[] height = new int[strs.length];
        for(int i=0; i<strs.length; i++){
            height[i] = Integer.parseInt(strs[i]);
        }
        Arrays.sort(height);
        ArrayList<Integer> list = new ArrayList<>(n);
        int j = n-1;
        int mid = (0+n-1)/2;
        for(int i=0; i<=mid&&j>=mid; i++){
            if(i == 0){
                list.add(height[n-1]);
                j--;
            }
			//������Ҫʹ������������if��䣬֮ǰʹ��if-else if-else�����һֱ�޷�AC
            if(i%2 == 0){
                list.add(height[i]);
                if(j>=mid && i!=mid){
                    list.add(height[j--]);
                }
            }
            if(i%2 == 1){
                list.add(0,height[i]);
                if(j>=mid && i!=mid){
                    list.add(0,height[j--]);
                }
            }
        }
        int sum = 0;
        if(list.size()>2){
            for(int i=1; i<n; i++){
                sum += Math.abs(list.get(i)-list.get(i-1));
            }
            System.out.println(sum);
        }
        else if(list.size()==1){
            System.out.println(list.get(0));
        }
        else if(list.size()==2){
            System.out.println(Math.abs(list.get(0)-list.get(1)));
        }
        else{
            System.out.println(0);
        }
    }
     
}