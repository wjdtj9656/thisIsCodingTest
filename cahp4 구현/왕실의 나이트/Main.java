import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int dx[] = {-2,-2,2,2,-1,-1,1,1};
        int dy[] = {-1,1,-1,1,-2,2,-2,2};
        String s = br.readLine();
        int x = s.charAt(0)-96;
        int y = s.charAt(1)-48;
        int count = 0;
        
        for(int i=0; i<8; i++) {
        	int nx = x + dx[i];
        	int ny = y + dy[i];
        	if(nx < 1 || ny < 1 || nx > 8 || ny > 8) continue;
        	count++;
        }
        bw.write(String.valueOf(count));
        br.close();
        bw.flush();
        bw.close();
    }

}