package BigComp_2018;

/*
	��Ŀ����
	��һ��ͯ�ڣ���ʦ���˺ܶ�óԵ��ɿ������׶�԰��ÿ���ɿ���j������Ϊw[j]������ÿ��С����i�������ֵ����ɿ�����С�ﵽh[i] (��w[j]>=h[i])�����Ż���ȥ���ݽ�Ŀ����ʦ��Ŀ���ǽ��ɿ����ַ��������ǣ�ʹ������С����̨���ݡ����Ա�֤ÿ��w[i]> 0�Ҳ��ܽ�����ɿ����ָ�һ�����ӻ�һ��ָ�������ӡ�
	��������:
	��һ�У�n����ʾh����Ԫ�ظ���
	 �ڶ��У�n��h����Ԫ��
	 �����У�m����ʾw����Ԫ�ظ���
	 �����У�m��w����Ԫ��
	�������:
	��̨����ѧ������
	
	ʾ��1
	����
	3 
	 2 2 3
	 2
	 3 1 
	���
	1
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public class childrenDay{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        String[] s = bf.readLine().split(" ");
        int[] h = new int[n];
        for(int i=0; i<n; i++){
            h[i] = Integer.parseInt(s[i]);
        }
        Arrays.sort(h);
        int m = Integer.parseInt(bf.readLine());
        String[] p = bf.readLine().split(" ");
        int[] w = new int[m];
        for(int i=0; i<m; i++){
            w[i] = Integer.parseInt(p[i]);
        }
        Arrays.sort(w);
        int result = 0;
        int i=0, j=0;
        while(i<n && j<m){
            if(w[j] >= h[i]){
                result++;
                i++;
            }
            j++;
        }
        System.out.println(result);
    }
}
