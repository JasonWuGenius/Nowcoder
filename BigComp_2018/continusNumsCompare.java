
package BigComp_2018;

/*
	题目描述
	对于任意两个正整数x和k,我们定义repeat(x, k)为将x重复写k次形成的数,例如repeat(1234, 3) = 123412341234,repeat(20,2) = 2020.
	牛牛现在给出4个整数x1, k1, x2, k2, 其中v1 = (x1, k1), v2 = (x2, k2),请你来比较v1和v2的大小。
	输入描述:
	输入包括一行,一行中有4个正整数x1, k1, x2, k2(1 ≤ x1,x2 ≤ 10^9, 1 ≤ k1,k2 ≤ 50),以空格分割
	输出描述:
	如果v1小于v2输出"Less",v1等于v2输出"Equal",v1大于v2输出"Greater".
	示例1
	输入
	复制
	1010 3 101010 2
	输出
	复制
	Equal
 */

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
public class continusNumsCompare{
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
