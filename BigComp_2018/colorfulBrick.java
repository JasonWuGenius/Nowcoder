package BigComp_2018;

/*
	题目描述
	小易有一些彩色的砖块。每种颜色由一个大写字母表示。各个颜色砖块看起来都完全一样。现在有一个给定的字符串s,s中每个字符代表小易的某个砖块的颜色。小易想把他所有的砖块排成一行。如果最多存在一对不同颜色的相邻砖块,那么这行砖块就很漂亮的。请你帮助小易计算有多少种方式将他所有砖块排成漂亮的一行。(如果两种方式所对应的砖块颜色序列是相同的,那么认为这两种方式是一样的。)
	例如: s = "ABAB",那么小易有六种排列的结果:
	"AABB","ABAB","ABBA","BAAB","BABA","BBAA"
	其中只有"AABB"和"BBAA"满足最多只有一对不同颜色的相邻砖块。
	输入描述:
	输入包括一个字符串s,字符串s的长度length(1 ≤ length ≤ 50),s中的每一个字符都为一个大写字母(A到Z)。
	输出描述:
	输出一个整数,表示小易可以有多少种方式。
	示例1
	输入
	ABAB
	输出
	2
 */

 
 import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
public class colorfulBrick{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        System.out.println(count(s));
    }
    public static int count(String str){
        char[] array = str.toCharArray();
        Arrays.sort(array);
        int count = 1;
        for(int i=1; i<array.length; i++){
            if(array[i] != array[i-1]){
                count++;
            }
        }
        int res=1;
		//这里的关键所在是结果只有三种
        if(count > 2){
            return 0;
        }
        else if(count == 2){
            return 2;
        }
        else{
            return 1;
        }

    }
}
