package BigComp_2018;

/*
	��Ŀ����
	ţţ��һ����Сд��ĸ��ɵ��ַ���s,��s�п�����һЩ��ĸ�ظ����֡�������"banana"��,��ĸ'a'����ĸ'n'�ֱ���������κ����Ρ�
	����ţţ��ϲ���ظ�������ͬһ����ĸ,��ֻ�뱣����һ�γ��ֲ�ɾ����������ֵ���ĸ�������ţţ��ɶ�s�Ĳ�����
	��������:
	�������һ���ַ���s,s�ĳ���length(1 �� length �� 1000),s�е�ÿ���ַ�����Сд��Ӣ����ĸ('a' - 'z')
	�������:
	���һ���ַ���,��ʾ����ţţҪ����ַ���
	ʾ��1
	����
	banana
	���
	ban
 */
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class deleteDuplicateChar{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chrs = br.readLine().toCharArray();
        StringBuffer sb = new StringBuffer();
        boolean[] flag = new boolean[26];
        for(int i=0; i<chrs.length; i++){
            if(flag[chrs[i] - 'a']){
                continue;
            }
            else{
                flag[chrs[i] - 'a'] = true;
                sb.append(chrs[i]);
            }
        }
        System.out.println(sb);
    }
}