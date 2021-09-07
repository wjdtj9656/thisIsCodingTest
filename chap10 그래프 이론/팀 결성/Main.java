import java.util.*;
import java.io.*;
public class Main {

	public static int[] parent = new int[10000];
	public static int N,M;
	public static int find(int x) {
		if(parent[x] == x) return x; 
		else {
			return parent[x] = find(parent[x]);
		}
	}
	public static void union(int x, int y) {
		x = find(x);
		y = find(y);
		if(x < y) parent[y] = x;
		else parent[x] = y;
	}
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        
        for (int i = 1; i <= N; i++) {
            parent[i] = i;
        }
        for(int i=0; i<M; i++) {
        	st = new StringTokenizer(br.readLine());
        	int a = Integer.parseInt(st.nextToken());
        	int b = Integer.parseInt(st.nextToken());
        	int c = Integer.parseInt(st.nextToken());
        	if( a==0 ) {
        		union(b,c);
        	}
        	else if( a==1 ) {
        		if(find(b) == find(c)) {
        			bw.write("YES"+"\n");
        		}
        		else {
        			bw.write("NO"+"\n");
        		}
        	}
        }
        
        br.close();
        bw.flush();
        bw.close();
    }
}