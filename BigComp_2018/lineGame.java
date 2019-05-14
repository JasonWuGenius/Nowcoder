package BigComp_2018;

/*
	连线游戏

	题目描述
	某一天，Alice 比较无聊，于是她为自己发明了一个游戏玩。首先她在纸上画了一个圆，然 后从这个圆的圆弧上均匀地取出 n 个点，这 n 个点将圆 n 等分。接下来，Alice 每次从这 n 个点中选取两个点，在这两个点之间画一条线段，但是要求这条线段不能与已有的线段相交 (允许在端点处相交)。为了能打发更多的时间，Alice 希望能画尽量多的线段，请你告诉她 最多她能画出几条线段?
	输入描述:
	第一行包含一个整数??，表示从圆弧上取出的点数。2 ≤ ?? ≤ 109

	输出描述:
	输出对应的答案。
	示例1
	输入
	复制
	2
	输出
	复制
	1
	说明
	示例2
	输入
	复制
	4
	输出
	复制
	5
	说明
 */

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        System.out.println(n+n-3);
    }
}
