import java.util.*;
import java.io.*;

public class Main {


    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int N = Integer.parseInt(st.nextToken());
    	int M = Integer.parseInt(st.nextToken());
    	
    	st = new StringTokenizer(br.readLine());
    	int arr[] = new int[N];
    	
    	for(int i=0; i<N; i++) {
    		arr[Integer.parseInt(st.nextToken())] += 1;
    	}
    	
    	int result = 0;
    	for(int i=1; i<=M; i++) {
    		N -= arr[i];
    		result += arr[i]*N;
    	}
    	bw.write(String.valueOf(result));
    	br.close();
    	bw.flush();
    	bw.close();
    }
}