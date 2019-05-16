package BigComp_2018;

/*
	硬币兑换

	题目描述
	A 国一共发行了几种不同面值的硬币，分别是面值 1 元，2 元，5 元，10 元，20 元，50 元， 100 元。假设每种面值的硬币数量是无限的，现在你想用这些硬币凑出总面值为 n 的硬币， 同时你想让选出的硬币中，不同的面值种类尽可能多;在面值种类尽可能多的情况下，你想 让选择的硬币总数目尽可能多，请问应该怎么选择硬币呢?
	输入描述:
	第一行包含一个数字??，表示要凑出的面值。1 ≤ ?? ≤ 109
	输出描述:
	输出两个整数，分别表示最多能有多少种类型的硬币以及在类型最多的情况下最多能用上多少枚硬币。
	示例1
	输入
	复制
	3
	输出
	复制
	2 2
	说明
	示例2
	输入
	复制
	10
	输出
	复制
	3 5
 */

import java.io.*;
import java.util.*;
public class Main{
    static Integer[] param = {1,2,5,10,20,50,100};
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int arg = Integer.parseInt(bf.readLine());
        int result1 = 0;
        int result2 = 0;
        for(int i=0; i<param.length; i++){
            arg -= param[i];
            if(arg >= 0){
                result1++;
                result2++;
            }
            else{
                arg+=param[i];
                break;
            }
        }
        if(arg>0){
            result2 += arg;
        }
        System.out.println(result1+" "+result2);
    }
}
