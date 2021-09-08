import java.util.*;
import java.io.*;

public class Main {


    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	String s = br.readLine();
    	int count0 = 0;
    	int count1 = 0;
    	
    	if(s.charAt(0)-'0'==1) count1++;
    	else {
    		count0++;
    	}
    	
    	for(int i=1; i<s.length(); i++) {
    		if(s.charAt(i)-'0' == 1 && s.charAt(i-1)-'0' != s.charAt(i)-'0') {
    			count1++;
    		}
    		else if(s.charAt(i)-'0' == 0 && s.charAt(i-1)-'0' != s.charAt(i)-'0') {
    			count0++;
    		}
    	}
    	int min = Math.min(count1, count0);
    	bw.write(String.valueOf(min));
    	
    	br.close();
    	bw.flush();
    	bw.close();
    }
}