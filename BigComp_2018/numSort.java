package BigComp_2018;

/*
	题目描述
	牛牛有一个长度为n的整数序列,牛牛想对这个序列进行重排为一个非严格升序序列。牛牛比较懒惰,他想移动尽量少的数就完成重排,请你帮他计算一下他最少需要移动多少个序列中的元素。(当一个元素不在它原来所在的位置,这个元素就是被移动了的)
	输入描述:
	输入包括两行,第一行一个整数n(1 ≤ n ≤ 50),即序列的长度
	第二行n个整数x[i](1 ≤ x[i] ≤ 100),即序列中的每个数
	输出描述:
	输出一个整数,即最少需要移动的元素个数
	示例1
	输入
	3
	3 2 1
	输出
	2

 */
 
//本题技巧在于将原数组进行排序后，将新数组和原数组的各位置进行比较，如果不相同，则整体移动次数加1
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        String[] s = bf.readLine().split(" ");
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = Integer.parseInt(s[i]);
        }
        int res = minMove(nums, n);
        System.out.println(minMove(nums, n));
    }
    public static int minMove(int[] nums, int n){
        int[] y = new int[n];
        int count = 0;
        y = nums.clone();
        Arrays.sort(y);
        for(int i=0; i<n; i++){
            if(nums[i] != y[i]){
                count++;
            }
        }
        return count;
    }
}
