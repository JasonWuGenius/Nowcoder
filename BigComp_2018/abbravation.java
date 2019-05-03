package BigComp_2018;

/*
	缩写

	题目描述
	在英文中,我们会把一些长的名字或者短语进行缩写。例如"looks good to me"缩写为"lgtm",短语中的每个单词的首字母组成缩写。现在给出一个字符串s,字符串s中包括一个或者多个单词,单词之间以空格分割,请输出这个字符串的缩写。
	输入描述:
	输入包括一个字符串s,字符串长度length(1 ≤ length ≤ 50),字符串中只包括小写字母('a'~'z')和空格。
	输出描述:
	输出一个字符串,即缩写的结果。
	示例1
	输入
	复制
	looks good to me
	输出
	复制
	lgtm
 */

import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] s = bf.readLine().split(" ");
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<s.length; i++){
            sb.append(s[i].charAt(0));
        }
        System.out.println(sb);
    }
}
