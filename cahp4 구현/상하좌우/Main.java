import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int  N = Integer.parseInt(br.readLine());
        int x = 1;
        int y = 1;
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()) {
        	String temp = st.nextToken();
        	if(temp.equals("L") && y > 1) {
        		y -= 1;
        	}
        	else if(temp.equals("R") && y < N) {
        		y += 1;
        	}
        	else if(temp.equals("U") && x > 1) {
        		x -= 1;
        	}
        	else if(temp.equals("D") && x < N){
        		x += 1;
        	}
        }
        bw.write(String.valueOf(x)+" "+String.valueOf(y));
        br.close();
        bw.flush();
        bw.close();
    }

}