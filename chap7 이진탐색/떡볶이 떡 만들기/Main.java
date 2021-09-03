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
    int left = 0;
    int right = arr[N-1];
    int mid = 0;
    int searchValue = M;
    int result = 0;
    while(left <= right) {
        mid = (left + right)/2;
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
        	if(arr[i] - mid > 0)
        	sum += (arr[i]-mid);
        }
        if(sum < searchValue) right = mid - 1;
        else {
        	result = mid;
        	left = mid + 1;
        }
    }
    bw.write(String.valueOf(result));
    
    br.close();
    bw.flush();
    bw.close();
    }
}