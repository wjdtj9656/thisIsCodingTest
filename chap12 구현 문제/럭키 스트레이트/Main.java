import java.util.*;
import java.io.*;
import java.io.*;
public class Main {


    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	String s = br.readLine();
    	int sum1 = 0;
    	int sum2 = 0;
    	
    	for(int i=0; i<s.length()/2; i++) {
    		sum1 += s.charAt(i);
    	}
    	for(int i=s.length()/2; i<s.length(); i++) {
    		sum2 += s.charAt(i);
    	}
    	
    	if(sum1 == sum2) {
    		bw.write("LUCKY");
    	}
    	else {
    		bw.write("READY");
    	}
    	br.close();
    	bw.flush();
    	bw.close();
    }
}