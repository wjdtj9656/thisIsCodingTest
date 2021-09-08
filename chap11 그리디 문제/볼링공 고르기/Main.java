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
    		arr[i] = Integer.parseInt(st.nextToken());
    	}
    	Arrays.sort(arr);
    	
    	int count = 0;
    	for(int i=0; i<N; i++) {
    		for(int j=i+1; j<N; j++) {
    			if(arr[i] == arr[j]) {
    				continue;
    			}
    			else {
    				count++;
    			}
    		}
    	}
    	bw.write(String.valueOf(count));
    	br.close();
    	bw.flush();
    	bw.close();
    }
}