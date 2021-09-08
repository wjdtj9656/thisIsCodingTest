import java.util.*;
import java.io.*;

public class Main {


    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int N = Integer.parseInt(br.readLine());
    	int arr[] = new int[N];
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	for(int i=0; i<N; i++) {
    		arr[i] = Integer.parseInt(st.nextToken());
    	}
    	Arrays.sort(arr);
    	
    	int target = 1;
    	for(int i=0; i<N; i++) {
    		if(target < arr[i]) break;
    		else {
    			target += arr[i];
    		}
    	}
    	bw.write(String.valueOf(target));
    	br.close();
    	bw.flush();
    	bw.close();
    }
}