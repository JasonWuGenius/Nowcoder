package BigComp_2018;

/*
	计算一年中的第几天

	题目描述
	今年的第几天？

	输入年、月、日，计算该天是本年的第几天。

	输入描述:
	包括三个整数年(1<=Y<=3000)、月(1<=M<=12)、日(1<=D<=31)。
	输出描述:
	输入可能有多组测试数据，对于每一组测试数据，
	输出一个整数，代表Input中的年、月、日对应本年的第几天。
	示例1
	输入
	复制
	1990 9 20
	2000 5 1
	输出
	复制
	263
	122
 */

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] s = bf.readLine().split(" ");
        int[] nums = new int[s.length];
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        int sum = 0;
        for(int i=0; i<s.length; i++){
            nums[i] = Integer.parseInt(s[i]);
        }
        if(nums[0]%4==0 && nums[0]!=0 || nums[0]%400==0){
            for(int j=0; j<(nums[1]-1); j++){
                sum += days[j];
            }
            sum = sum+nums[2]+1;
            System.out.println(sum);
        }
        else{
            for(int k=0; k<(nums[1]-1); k++){
                sum += days[k];
            }
            sum = sum+nums[2];
            System.out.println(sum);
        }
    }
}
