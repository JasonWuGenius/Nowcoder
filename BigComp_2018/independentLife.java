package BigComp_2018;

/*
	��Ŀ����
	С��Ϊ�������ĸ�ĸ�������Ѿ����������,���������ȥ�Լ���סһ��ʱ�䡣һ����������������໨��: С��ÿ������һ��ˮ��������Ҫÿ��֧��xԪ�ķ�����𡣵�ǰС�������Ѿ���f��ˮ����dԪǮ,С��Ҳ��ȥ�̵깺��һЩˮ��,�̵�ÿ��ˮ������pԪ��С��Ϊ�˱������������������,ϣ���ܶ��������ʱ��Խ��Խ��,С��ϣ��������������һ��������ܶ�����������졣
	��������:
	�������һ��,�ĸ�����x, f, d, p(1 �� x,f,d,p �� 2 * 10^9),�Կո�ָ�
	�������:
	���һ������, ��ʾС������ܶ�����������졣
	ʾ��1
	����
	3 5 100 10
	���
	11
 */

 //�ؼ����������м�����������ڵ��жϣ������˷������ۡ�
 
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = br.readLine().split(" ");
        System.out.println(maxDay(strs));
    }
    public static int maxDay(String[] strs){
        int x = Integer.parseInt(strs[0]);
        int f = Integer.parseInt(strs[1]);
        int d = Integer.parseInt(strs[2]);
        int p = Integer.parseInt(strs[3]);
        if(d/x <= f){
            return d/x;
        }
        else{
            return (d-f*x)/(x+p)+f;
        }
    }
}