package BigComp_2018;

/*
	Ӳ�Ҷһ�

	��Ŀ����
	A ��һ�������˼��ֲ�ͬ��ֵ��Ӳ�ң��ֱ�����ֵ 1 Ԫ��2 Ԫ��5 Ԫ��10 Ԫ��20 Ԫ��50 Ԫ�� 100 Ԫ������ÿ����ֵ��Ӳ�����������޵ģ�������������ЩӲ�Ҵճ�����ֵΪ n ��Ӳ�ң� ͬʱ������ѡ����Ӳ���У���ͬ����ֵ���ྡ���ܶ�;����ֵ���ྡ���ܶ������£����� ��ѡ���Ӳ������Ŀ�����ܶ࣬����Ӧ����ôѡ��Ӳ����?
	��������:
	��һ�а���һ������??����ʾҪ�ճ�����ֵ��1 �� ?? �� 109
	�������:
	��������������ֱ��ʾ������ж��������͵�Ӳ���Լ������������������������϶���öӲ�ҡ�
	ʾ��1
	����
	����
	3
	���
	����
	2 2
	˵��
	ʾ��2
	����
	����
	10
	���
	����
	3 5
 */

import java.io.*;
import java.util.*;
public class Main{
    static Integer[] param = {1,2,5,10,20,50,100};
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int arg = Integer.parseInt(bf.readLine());
        int result1 = 0;
        int result2 = 0;
        for(int i=0; i<param.length; i++){
            arg -= param[i];
            if(arg >= 0){
                result1++;
                result2++;
            }
            else{
                arg+=param[i];
                break;
            }
        }
        if(arg>0){
            result2 += arg;
        }
        System.out.println(result1+" "+result2);
    }
}
