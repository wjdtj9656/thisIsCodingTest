import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
   
    int arr[] = {1,3,3,2,1123,23};
    
    for(int i=0; i<arr.length; i++) {
    	for(int j=i; j>0; j--) {
    		if(arr[j] <arr[j-1]) {
    			int temp =arr[j];
    			arr[j] = arr[j-1];
    			arr[j-1] = temp;
    		}
    		else {
    			break;
    		}
    	}
    }
    
    for(int i=0; i<arr.length; i++) {
    	bw.write(String.valueOf(arr[i]+" "));
    }
    br.close();
    bw.flush();
    bw.close();
    }
}