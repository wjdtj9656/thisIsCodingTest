import java.io.*;
import java.util.*;
class Node{
	int x;
	int y;
	Node(int x,int y){
		this.x = x;
		this.y = y;
	}
}
public class Main {
	static int N;
	static int M;
	static int arr[][];
	
	static int dx[] = {-1,1,0,0};
	static int dy[] = {0,0,-1,1};
	public static void bfs(int x,int y) {
		Queue<Node> q = new LinkedList<>();
		q.add(new Node(x,y));
		
		while(!q.isEmpty()) {
			Node temp = q.poll();
			x = temp.x;
			y = temp.y;
			for(int i=0; i<4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];	
				if(nx <= -1 || ny <= -1 || nx >= N || ny >= M) continue;
				if(arr[nx][ny] == 0) continue;
				if(arr[nx][ny] == 1) {
					arr[nx][ny] = arr[x][y] + 1;
					q.add(new Node(nx,ny));
				}
			}
		}
	}
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N][M];
        
        for(int i=0; i<N; i++) {
        	String s = br.readLine();
        	for(int j=0; j<M; j++) {
        		arr[i][j] = s.charAt(j) -'0';
        	}
        }
        
        bfs(0,0);
        
        bw.write(String.valueOf(arr[N-1][M-1]));
       
        br.close();
        bw.flush();
        bw.close();
    }

}