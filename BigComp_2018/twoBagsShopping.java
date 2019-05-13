package BigComp_2018;

/*
	双袋购物

	示例1
	输入
	复制
	5 10 50
	3 3
	7 4
	4 7
	49 50
	2 2
	输出
	复制
	60
	说明
	用一号袋子装1号和3号物品，之后收起一号袋子，用二号袋子装4号物品。
 */

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] s = bf.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int a = Integer.parseInt(s[1]);
        int b = Integer.parseInt(s[2]);
        
        int[] v = new int[n+2];
        int[] w = new int[n+2];
        for(int i=1; i<=n; i++){
            String[] str = bf.readLine().split(" ");
            v[i] = Integer.parseInt(str[0]);
            w[i] = Integer.parseInt(str[1]);
        }
        
        int[] bagA = new int[a+1], resA = new int[n+2];
        for(int i=1; i<=n; i++){
            for(int j=a; j>=v[i]; j--){
                bagA[j] = Math.max(bagA[j], bagA[j-v[i]]+w[i]);
            }
            resA[i] = bagA[a];
        }
        
        int[] bagB = new int[b+1], resB = new int[n+2];
        for(int i=n; i>0; i--){
            for(int j=b; j>=v[i]; j--){
                bagB[j] = Math.max(bagB[j], bagB[j-v[i]]+w[i]);
            }
            resB[i] = bagB[b];
        }
        
        int res = 0;
        for(int i=0; i<=n; i++){
            res = Math.max(res, resA[i]+resB[i+1]);
        }
        System.out.println(res);
    }
}
