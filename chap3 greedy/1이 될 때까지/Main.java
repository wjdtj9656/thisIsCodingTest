
import java.io.*;
import java.util.*;

public class Main { 
	/*
	 * 
	 */
	public static void main(String[] args) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int result = 0;
		
		while( N != 1) {
			if(N % K == 0) {
				N /= K;
			}
			else {
				N -= 1;
			}
			result++;
		}
		bw.write(String.valueOf(result));
		
		br.close();
		bw.flush();	
		bw.close();
	}
}