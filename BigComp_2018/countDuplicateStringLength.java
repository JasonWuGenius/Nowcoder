package BigComp_2018;

/*
	计算重复字符串长度
	
	题目描述
	请从字符串中找出至少重复一次的子字符串的最大长度
	输入描述:
	字符串，长度不超过1000
	输出描述:
	重复子串的长度，不存在输出0
	示例1
	输入
	复制
	ababcdabcefsgg
	输出
	复制
	3
	说明
	abc为重复的最大子串，长度为3
 */

import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        int length = s.length();
        int max_count = 0;
        for(int i=0; i<length; i++){
            for(int j=i+1; j<length; j++){
                int idx_i = i;
                int idx_j = j;
                int count = 0;
                while(idx_i < length && idx_j < length && s.charAt(idx_i) == s.charAt(idx_j)){
                    idx_i += 1;
                    idx_j += 1;
                    count += 1;
                }
                max_count = count > max_count? count : max_count;
            }
        }
        System.out.println(max_count);
    }
}
