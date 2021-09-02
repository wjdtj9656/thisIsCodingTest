import java.util.*;
import java.io.*;

public class Main {
	
    public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
   
    int num = Integer.parseInt(br.readLine());
    
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    int had[] = new int[num];
    for(int i=0; i<had.length; i++) {
    	had[i] = Integer.parseInt(st.nextToken());
    }
    Arrays.sort(had);
    int num2 = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine());
    int need[] = new int[num2];
    for(int i=0; i<need.length; i++) {
    	need[i] = Integer.parseInt(st.nextToken());
    }
    
    int result = -1;
    
    for(int i=0; i<num2; i++) {
    int left = 0;
    int right = num-1;
    int mid = (left+right)/2;
    int value = need[i];
    while(left <= right) {
    	mid = (left+right)/2;
    	if(had[mid] == value) {
    		result = mid;
    		break;
    	}
    	else if(had[mid] > value) {
    		right = mid-1;
    	}
    	else {
    		left = mid+1;
    	}
    	}
    if(result == -1) {
    	bw.write("no ");
    }
    else {
    	bw.write("yes ");
    }
    }
    br.close();
    bw.flush();
    bw.close();
    }
}