package BigComp_2018;

/*
	题目描述
	小易老师是非常严厉的,它会要求所有学生在进入教室前都排成一列,并且他要求学生按照身高不递减的顺序排列。有一次,n个学生在列队的时候,小易老师正好去卫生间了。学生们终于有机会反击了,于是学生们决定来一次疯狂的队列,他们定义一个队列的疯狂值为每对相邻排列学生身高差的绝对值总和。由于按照身高顺序排列的队列的疯狂值是最小的,他们当然决定按照疯狂值最大的顺序来进行列队。现在给出n个学生的身高,请计算出这些学生列队的最大可能的疯狂值。小易老师回来一定会气得半死。
	输入描述:
	输入包括两行,第一行一个整数n(1 ≤ n ≤ 50),表示学生的人数
	第二行为n个整数h[i](1 ≤ h[i] ≤ 1000),表示每个学生的身高
	输出描述:
	输出一个整数,表示n个学生列队可以获得的最大的疯狂值。

	如样例所示: 
	当队列排列顺序是: 25-10-40-5-25, 身高差绝对值的总和为15+30+35+20=100。
	这是最大的疯狂值了。
	示例1
	输入
	5
	5 10 25 40 25
	输出
	100
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.ArrayList;
public class crazyQueue{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] strs = br.readLine().split(" ");
        int[] height = new int[strs.length];
        for(int i=0; i<strs.length; i++){
            height[i] = Integer.parseInt(strs[i]);
        }
        Arrays.sort(height);
        ArrayList<Integer> list = new ArrayList<>(n);
        int j = n-1;
        int mid = (0+n-1)/2;
        for(int i=0; i<=mid&&j>=mid; i++){
            if(i == 0){
                list.add(height[n-1]);
                j--;
            }
			//这里需要使用连续的三个if语句，之前使用if-else if-else的语句一直无法AC
            if(i%2 == 0){
                list.add(height[i]);
                if(j>=mid && i!=mid){
                    list.add(height[j--]);
                }
            }
            if(i%2 == 1){
                list.add(0,height[i]);
                if(j>=mid && i!=mid){
                    list.add(0,height[j--]);
                }
            }
        }
        int sum = 0;
        if(list.size()>2){
            for(int i=1; i<n; i++){
                sum += Math.abs(list.get(i)-list.get(i-1));
            }
            System.out.println(sum);
        }
        else if(list.size()==1){
            System.out.println(list.get(0));
        }
        else if(list.size()==2){
            System.out.println(Math.abs(list.get(0)-list.get(1)));
        }
        else{
            System.out.println(0);
        }
    }
     
}