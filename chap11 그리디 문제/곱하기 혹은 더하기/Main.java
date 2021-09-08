import java.util.*;
import java.io.*;

public class Main {


    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	String s = br.readLine();
    	int arr[] = new int[s.length()];
    	
    	for(int i=0; i<s.length(); i++) {
    		arr[i] = s.charAt(i)-'0';
    	}
    	int result = arr[0];
    	
    	for(int i=1; i<s.length(); i++) {
    		if(arr[i] == 0 || arr[i] == 1 || result == 0 || result == 1) {
    			result += arr[i];
    		}
    		else {
    			result *= arr[i];
    		}
    	}
    	bw.write(String.valueOf(result));
    	br.close();
    	bw.flush();
    	bw.close();
    }
}