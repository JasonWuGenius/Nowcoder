package BigComp_2018;

/*
	��Ŀ����
	С����һЩ��ɫ��ש�顣ÿ����ɫ��һ����д��ĸ��ʾ��������ɫש�鿴��������ȫһ����������һ���������ַ���s,s��ÿ���ַ�����С�׵�ĳ��ש�����ɫ��С����������е�ש���ų�һ�С����������һ�Բ�ͬ��ɫ������ש��,��ô����ש��ͺ�Ư���ġ��������С�׼����ж����ַ�ʽ��������ש���ų�Ư����һ�С�(������ַ�ʽ����Ӧ��ש����ɫ��������ͬ��,��ô��Ϊ�����ַ�ʽ��һ���ġ�)
	����: s = "ABAB",��ôС�����������еĽ��:
	"AABB","ABAB","ABBA","BAAB","BABA","BBAA"
	����ֻ��"AABB"��"BBAA"�������ֻ��һ�Բ�ͬ��ɫ������ש�顣
	��������:
	�������һ���ַ���s,�ַ���s�ĳ���length(1 �� length �� 50),s�е�ÿһ���ַ���Ϊһ����д��ĸ(A��Z)��
	�������:
	���һ������,��ʾС�׿����ж����ַ�ʽ��
	ʾ��1
	����
	ABAB
	���
	2
 */

 
 import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
public class colorfulBrick{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        System.out.println(count(s));
    }
    public static int count(String str){
        char[] array = str.toCharArray();
        Arrays.sort(array);
        int count = 1;
        for(int i=1; i<array.length; i++){
            if(array[i] != array[i-1]){
                count++;
            }
        }
        int res=1;
		//����Ĺؼ������ǽ��ֻ������
        if(count > 2){
            return 0;
        }
        else if(count == 2){
            return 2;
        }
        else{
            return 1;
        }

    }
}
