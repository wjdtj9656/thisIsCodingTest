import java.util.*;
import java.io.*;
public class Main {
	
    public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
   
    int num = Integer.parseInt(br.readLine());
    
    Integer arr[] = new Integer[num];
    
    for(int i=0; i<num; i++) {
    	arr[i] = Integer.parseInt(br.readLine());
    }
    Arrays.sort(arr,Collections.reverseOrder());
    
    for(int i=0; i<arr.length; i++) {
    	bw.write(String.valueOf(arr[i]+" "));
    }
    br.close();
    bw.flush();
    bw.close();
    }
}