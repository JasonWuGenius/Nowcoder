package BigComp_2018;

/*
 * ��Ŀ����
	�����Ͷ����Ǻ����ѡ�������ϲ�����ġ�������ָ��ǰ������ʹӺ���ǰ����һ���Ĵ������׼��������һ����ϲ,��ȡ��һ���ַ���s,Ȼ���ں��渽��0�����߸������ĸ�γɻ���,����ϣ���������Խ��Խ�á�����������������ܹ��õ�����̵Ļ��ĳ��ȡ�
	��������:
	�������һ���ַ���s,�ַ���s����length(1 �� length �� 50)
	�������:
	���һ������,��ʾţţ�ܹ��õ�����̵Ļ��ĳ��ȡ�
	
	ʾ��1
	����
	abab
	���
	5
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class palindrome{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str= br.readLine();
        char[] c = str.toCharArray();
        
        int n = c.length;
        for(int i=0; i != n; i++){
            if(judge(c, i, n-1)){
                System.out.println(n+i);
                return;
            }
        }
        return;
    }
    private static boolean judge(char[] arr, int i, int j){
        while(i<j){
            if(arr[i++] != arr[j--]){
                return false;
            }
        }
        return true;
    }
}
