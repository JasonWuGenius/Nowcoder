package BigComp_2018;

/*
	题目列表

	题目描述
	示例1
	输入
	复制
	4
	math 100 90
	algorithm 10 8
	string 50 1
	dp 100 50
	输出
	复制
	algorithm 3
	dp 4
	math 3
	string 5
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map.Entry;
import java.util.TreeMap;
public class titleList{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        TreeMap<String, Integer> map = new TreeMap<>();
        for(int i=0; i<n; i++){
            String[] s = bf.readLine().split(" ");
            double X = Integer.parseInt(s[1]);
            double Y = Integer.parseInt(s[2]);
            int diffcult = Y/X <= 0.3? 5 : (Y/X <= 0.6? 4: 3 );
            map.put(s[0], diffcult);
        }
        for(Entry<String, Integer> entry: map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}

