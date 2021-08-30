import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        int curX = Integer.parseInt(st.nextToken());
        int curY = Integer.parseInt(st.nextToken());
        int curSee = Integer.parseInt(st.nextToken());
        //ºÏµ¿³²¼­
        int dx[] = {0,1,0,-1};
        int dy[] = {-1,0,1,0};
        int count = 1;
        
        int arr[][] = new int[N][M];
        boolean visit[][] = new boolean[N][M];
        visit[curX][curY] = true;
        for(int i=0; i<N; i++) {
        	st = new StringTokenizer(br.readLine());
        	for(int j=0; j<M; j++) {
        		arr[i][j] = Integer.parseInt(st.nextToken());
        	}
        }
        while(true) {
        	int exitCount = 0;
        for(int i=0; i<4; i++) {
        	if(curX+dx[curSee]<M && curY+dy[curSee] < N) {
        	int nx = curX+dx[curSee]; int ny = curY+dy[curSee];
        	if(visit[nx][ny] != true && arr[nx][ny] == 0) {
        		exitCount++;
        		count++;
        		curX = nx;
        		curY = ny;
        		visit[nx][ny] = true;
        		break;
        	}
        	else {
        		nx = curX;
        		ny = curY;
        		}
        	}
        	if(curSee == 0) curSee = 3;
        	else {
        		curSee -= 1;
        		}
        	}
        if(exitCount == 0) break;
        }
        bw.write(String.valueOf(count));
        br.close();
        bw.flush();
        bw.close();
    }

}