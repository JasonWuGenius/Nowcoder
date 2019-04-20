
package BigComp_2018;

/*
	��Ŀ����
	������������������x��k,���Ƕ���repeat(x, k)Ϊ��x�ظ�дk���γɵ���,����repeat(1234, 3) = 123412341234,repeat(20,2) = 2020.
	ţţ���ڸ���4������x1, k1, x2, k2, ����v1 = (x1, k1), v2 = (x2, k2),�������Ƚ�v1��v2�Ĵ�С��
	��������:
	�������һ��,һ������4��������x1, k1, x2, k2(1 �� x1,x2 �� 10^9, 1 �� k1,k2 �� 50),�Կո�ָ�
	�������:
	���v1С��v2���"Less",v1����v2���"Equal",v1����v2���"Greater".
	ʾ��1
	����
	����
	1010 3 101010 2
	���
	����
	Equal
 */

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] s = bf.readLine().split(" ");
        String x1 = s[0];
        int k1 = Integer.parseInt(s[1]);
        String x2 = s[2];
        int k2 = Integer.parseInt(s[3]);
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();
        for(int i=0; i<k1; i++){
            sb1.append(x1);
        }
        for(int i=0; i<k2; i++){
            sb2.append(x2);
        }
        int len1 = sb1.toString().length();
        int len2 = sb2.toString().length();
        if(len1 > len2){
            System.out.println("Greater");
        }
        else if(len1 < len2){
            System.out.println("Less");
        }
        else{
            int flag = 0;
            for(int i=0; i<len1; i++){
                if(sb1.charAt(i) > sb2.charAt(i)){
                    flag = 1;
                    break;
                }
                else if(sb1.charAt(i) < sb2.charAt(i)){
                    flag = -1;
                    break;
                }
            }
            if(flag == 0){
                System.out.println("Equal");
            }
            else if(flag == 1){
                System.out.println("Greater");
            }
            else{
                System.out.println("Less");
            }
        }
    }
}
