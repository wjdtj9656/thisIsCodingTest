
import java.io.*;
import java.util.*;

public class Main { 
	/*
	 * 2828 problem
	 */
	public static void main(String[] args) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int arr[][] = new int[N][M];
		int max = 0;
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<M; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(arr[i]);
			if( max < arr[i][0]) {
				max = arr[i][0];
			}
		}
		bw.write(String.valueOf(max));
		
		br.close();
		bw.flush();	
		bw.close();
	}
}