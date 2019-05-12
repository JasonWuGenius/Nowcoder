package BigComp_2018;

/*
	题目描述
	牛牛有4根木棍,长度分别为a,b,c,d。羊羊家提供改变木棍长度的服务,如果牛牛支付一个硬币就可以让一根木棍的长度加一或者减一。牛牛需要用这四根木棍拼凑一个正方形出来,牛牛最少需要支付多少硬币才能让这四根木棍拼凑出正方形。
	输入描述:
	输入包括一行,四个整数a,b,c,d(1 ≤ a,b,c,d ≤ 10^6), 以空格分割
	输出描述:
	输出一个整数,表示牛牛最少需要支付的硬币
	示例1
	输入
	复制
	4 1 5 4
	输出
	复制
	4
 */

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
public class pieceSquare{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] s = bf.readLine().split(" ");
        int[] nums = new int[s.length];
        for(int i=0; i<s.length; i++){
            nums[i] = Integer.parseInt(s[i]); 
        }
        Arrays.sort(nums);
        int money = nums[3] - nums[0] + nums[2] - nums[1];
        System.out.print(money);
    }
}
