package BigComp_2018;

/*
	乔乔的包

	题目描述
	玥玥带乔乔一起逃亡，现在有许多的东西要放到乔乔的包里面，但是包的大小有限，所以我们只能够在里面放入非常重要的物品。现在给出该种物品的数量、体积、价值的数值，希望你能够算出怎样能使背包的价值最大的组合方式，并且输出这个数值，乔乔会非常感谢你。

	输入描述:
	第1行有2个整数，物品种数n和背包装载体积v；

	第2行到i+1行每行3个整数，为第i种物品的数量m、体积w、价值s。
	输出描述:
	仅包含一个整数，即为能拿到的最大的物品价值总和。
	示例1
	输入
	复制
	2 10
	3 4 3
	2 2 5
	输出
	复制
	13
	说明
	选第一种一个，第二种两个，结果为3x1+5x2=13。
	备注:
	1≤v≤500

	1≤n≤2000

	1≤m≤10

	1≤w≤20

	1≤s≤100
 */

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] str1 = bf.readLine().split(" ");
        int n = Integer.parseInt(str1[0]);
        int v = Integer.parseInt(str1[1]);
        int[] m = new int[n];
        int[] w = new int[n];
        int[] s = new int[n];
        for(int i=0; i<n; i++){
            String[] str2 = bf.readLine().split(" ");
            m[i] = Integer.parseInt(str2[0]);
            w[i] = Integer.parseInt(str2[1]);
            s[i] = Integer.parseInt(str2[2]);
        }
        int[] memo = new int[v+1];
        for(int i=0; i<n; i++){
            for(int j=v; j>=w[i]; j--){
                for(int k=1; k<=m[i] && j>=k*w[i]; k++){
                    int temp = k*s[i]+memo[j-k*w[i]];
                    if(memo[j]<temp){
                        memo[j] = temp;
                    }
                }
            }
        }
        System.out.println(memo[v]);
    }
}
