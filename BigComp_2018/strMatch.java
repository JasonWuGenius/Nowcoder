package BigComp_2018;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
public class strMatch {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str1 = bf.readLine();
        String str2 = bf.readLine();
        int len1 = str1.length();
        int len2 = str2.length();
        int result = 0;
        int[][] dp = new int[len1+1][len2+1];
        for(int i=1; i<=len1; i++){
            for(int j=1; j<=len2; j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                    result = Math.max(dp[i][j], result);
                }
                else{
                    dp[i][j] = 0;
                }
            }
        }
        System.out.println(result);
    }
}
