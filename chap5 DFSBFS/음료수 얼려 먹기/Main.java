import java.io.*;
import java.util.*;

public class Main {

	static int arr[][];
	static boolean visit[][];
	static int N;
	static int M;
	
	public static boolean dfs(int x,int y) {
		Stack<Integer> s = new Stack<>();
		if(x <= -1 || x >= N || y <= -1 || y>= M) return false;
		
		if(arr[x][y] == 0) {
			arr[x][y] = 1;
			dfs(x-1,y);
			dfs(x+1,y);
			dfs(x,y+1);
			dfs(x,y-1);
			return true;
		}
		return false;
	}
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N][M];
        visit = new boolean[N][M];
        int result = 0;
        
        for(int i=0; i<N; i++) {
        	String s = br.readLine();
        	for(int j=0; j<M; j++) {
        		arr[i][j] = s.charAt(j)-48;
        	}
        }
        for(int i=0; i<N; i++) {
        	for(int j=0; j<M; j++) {
        		if(dfs(i,j) == true) result++;
        	}
        }
        bw.write(String.valueOf(result));
        br.close();
        bw.flush();
        bw.close();
    }

}