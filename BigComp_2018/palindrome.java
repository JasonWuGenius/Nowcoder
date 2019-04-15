package BigComp_2018;

/*
 * 题目描述
	京京和东东是好朋友。东东很喜欢回文。回文是指从前往后读和从后往前读是一样的词语。京京准备给东东一个惊喜,先取定一个字符串s,然后在后面附上0个或者更多个字母形成回文,京京希望这个回文越短越好。请帮助京京计算他能够得到的最短的回文长度。
	输入描述:
	输入包括一个字符串s,字符串s长度length(1 ≤ length ≤ 50)
	输出描述:
	输出一个整数,表示牛牛能够得到的最短的回文长度。
	
	示例1
	输入
	abab
	输出
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
