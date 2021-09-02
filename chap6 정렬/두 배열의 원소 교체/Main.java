import java.util.*;
import java.io.*;

public class Main {
	
    public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
   
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());
    
    st = new StringTokenizer(br.readLine());
    int arr1[] = new int[N];
    int arr2[] = new int[N];
    int result = 0;
    
    for(int i=0; i<N; i++) {
    	arr1[i] = Integer.parseInt(st.nextToken());
    }
    
    st = new StringTokenizer(br.readLine());
    for(int i=0; i<N; i++) {
    	arr2[i] = Integer.parseInt(st.nextToken());
    }
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    
    for(int i=0; i<K; i++) {
    	int temp = arr1[i];
    	arr1[i] = arr2[N-1-i];
    	arr2[N-1-i] = temp;
    }
    
    for(int i :arr1) {
    result += i;	
    }
    bw.write(String.valueOf(result));
    br.close();
    bw.flush();
    bw.close();
    }
}