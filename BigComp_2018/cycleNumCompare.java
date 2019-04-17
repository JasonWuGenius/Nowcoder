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
	1010 3 101010 2
	输出
	Equal
 */
 
 //本题的技巧在于对于值的比较转化为对于长度的比较
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
        String res = repeat(x1, k1, x2, k2);
        System.out.println(res);
    }
    public static String repeat(String x1, int k1, String x2, int k2){
        StringBuffer sb1 = new StringBuffer(x1);
        StringBuffer sb2 = new StringBuffer(x2);
        for(int i=1; i<k1; i++){
            sb1.append(x1);
        }
        for(int i=1; i<k2; i++){
            sb2.append(x2);
        }
        if(sb1.length() > sb2.length()){
            return "Greater";
        }
        else if(sb1.length() < sb2.length()){
            return "Less";
        }
        else{
            char[] c1 = sb1.toString().toCharArray();
            char[] c2 = sb2.toString().toCharArray();
            for(int i=0; i<c1.length; i++){
                if(c1[i] - '0' > c2[i] - '0'){
                    return "Greater";
                }
                else if(c1[i] - '0' < c2[i] - '0'){
                    return "Less";
                }
                else{
                    continue;
                }
            }
        }
        return "Equal";
    }
}
