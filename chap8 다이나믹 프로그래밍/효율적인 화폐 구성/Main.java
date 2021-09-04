import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int N = Integer.parseInt(st.nextToken());
    	int M = Integer.parseInt(st.nextToken());
    	int coin[] = new int[N];
    	int dp[] = new int[M+1];
    	for(int i=0; i<N; i++) {
    		coin[i] = Integer.parseInt(br.readLine());
    	}
    	for(int i=0; i<=M; i++) {
    		dp[i] = 10001;
    	}
    	
    	dp[0] = 0;
    	for(int i=0; i<N; i++) {
    		for(int j=coin[i]; j<M+1; j++) {
    			if(dp[j-coin[i]] != 10001) {
    				dp[j] = Math.min(dp[j], dp[j-coin[i]]+1);
    			}
    		}
    	}
    	if (dp[M] == 10001) {
    		bw.write(String.valueOf(-1));
    	}
    	else {
    		bw.write(String.valueOf(dp[M]));
    	}
    	
    	br.close();
    	bw.flush();
    	bw.close();
    	
    }
}