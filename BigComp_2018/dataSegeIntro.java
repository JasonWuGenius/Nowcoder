package BigComp_2018;

/*
	数据分页说明

	题目描述
	数据分页,对于指定的页数和每页的元素个数，返回该页应该显示的数据。
	输入描述:
	第一行输入数据个数，第二行全部数据，第三行输入页数，第四行输入每页最大数据个数
	输出描述:
	输出该页应该显示的数据，超出范围请输出'超过分页范围'
	示例1
	输入
	复制
	6
	1 2 3 4 5 6
	1
	2
	输出
	复制
	3
	4

 */

import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        String[] s = bf.readLine().split(" ");
        int[] pages = new int[n];
        for(int i=0; i<n; i++){
            pages[i] = Integer.parseInt(s[i]);
        }
        int cur = Integer.parseInt(bf.readLine());
        int r = Integer.parseInt(bf.readLine());
        int index = cur*r;
        if(index >= n){
            System.out.println("超过分页范围");
        }
        else{
            for(int i=index; i<index+r; i++){
                System.out.println(pages[i]);
            }
        }
    }
}
