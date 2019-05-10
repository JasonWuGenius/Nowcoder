package BigComp_2018;

/**
	超链接

	题目描述

	输入描述:

	输出描述:

	示例1
	输入
	复制
	5
	sina
	qq
	taobao
	jd
	baidu
	3
	qq
	baidu
	baidu
	输出
	复制
	jd
	sina
	taobao
	说明

*/

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        TreeMap<String, Boolean> map = new TreeMap<>();
        for(int i=0; i<n; i++){
            map.put(bf.readLine(), false);
        }
        int m = Integer.parseInt(bf.readLine());
        for(int i=0; i<m; i++){
            map.put(bf.readLine(), true);
        }
        for(Map.Entry<String, Boolean> entry: map.entrySet()){
            if(!entry.getValue()){
                System.out.println(entry.getKey());
            }
        }
    }
}
