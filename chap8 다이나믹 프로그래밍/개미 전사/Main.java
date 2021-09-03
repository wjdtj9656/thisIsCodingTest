import java.util.*;
import java.io.*;

public class Main {
	
    public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
   
    int num = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    int arr[] = new int[st.countTokens()];
    int dp[] = new int[arr.length+1];
    for(int i=0; i<arr.length; i++) {
    	arr[i] = Integer.parseInt(st.nextToken());
    }
    dp[0] = 0;
    dp[1] = arr[0];
    dp[2] = Math.max(dp[1], arr[1]);
    
    for(int i=3; i<=num; i++) {
    	dp[i] = Math.max(dp[i-1], dp[i-2]+arr[i-1]);
    }
    bw.write(String.valueOf(dp[arr.length]));
    br.close();
    bw.flush();
    bw.close();
    }
}