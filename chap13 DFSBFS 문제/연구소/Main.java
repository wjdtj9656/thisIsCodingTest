import java.util.*;
import java.io.*;
class Node{
	int x;
	int y;
	public Node(int x,int y) {
		this.x = x;
		this.y = y;
	}
}
public class Main {

	
	static int dx[] = {-1,1,0,0};
	static int dy[] = {0,0,-1,1};
	static int N,M;
	static int map[][];
	static int result = -(int)1e9;
	public static void dfs(int x) {
		if(x == 3) {
			bfs();
			return;
		}
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(map[i][j] == 0) {
					map[i][j] = 1;
					dfs(x+1);
					map[i][j] = 0;
				}
			}
		}
	}
	public static void bfs() {
		int bmap[][] = new int[N][M];
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				bmap[i][j] = map[i][j];
			}
		}
		Queue<Node> q = new LinkedList<>();
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(bmap[i][j] == 2) {
					q.add(new Node(i,j));
				}
			}
		}
		while(!q.isEmpty()) {
			Node temp = q.poll();
			int x = temp.x;
			int y = temp.y;
			for(int i=0; i<4; i++) {
				int ax = x + dx[i];
				int ay = y + dy[i];
				
				if(ax>=0 && ay>=0 && ax<N && ay<M) {
					if(bmap[ax][ay] == 0) {
						bmap[ax][ay] = 2;
						q.add(new Node(ax,ay));
					}
				}
			}
		}
		calResult(bmap);
	}
	public static void calResult(int arr[][]) {
		int result2 = 0;
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(arr[i][j] == 0) {
					result2++;
				}
			}
		}
		result = Math.max(result, result2);
	}
    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	N = Integer.parseInt(st.nextToken());
    	M = Integer.parseInt(st.nextToken());
    	map = new int[N][M];
    	
    	for(int i=0; i<N; i++) {
    		st = new StringTokenizer(br.readLine());
    		for(int j=0; j<M; j++) {
    			map[i][j] = Integer.parseInt(st.nextToken());
    		}
    	}
    	for(int i=0; i<N; i++) {
    		for(int j=0; j<M; j++) {
    			if(map[i][j] == 0) {
    				map[i][j] = 1;
    				dfs(1);
    				map[i][j] = 0;
    			}
    		}
    	}
    	bw.write(String.valueOf(result));
    	br.close();
    	bw.flush();
    	bw.close();
    }
}