import java.util.*;
import java.io.*;
public class Main {
	
    public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
   
    int arr[] = {12,3,432,3211,324325,1111};
    int max =0;
    for(int i=0; i<arr.length; i++) {
    	if(arr[i] > max) {
    		max = arr[i];
    	}
    }
    int sortArr[] = new int[max+1];
    for(int i=0; i<arr.length; i++) {
    	sortArr[arr[i]] += 1;
    }
    
    for(int i=0; i<sortArr.length; i++) {
    	for(int j=0; j<sortArr[i]; j++) {
    		System.out.println(i);
    	}
    }
    
    br.close();
    bw.flush();
    bw.close();
    }
}