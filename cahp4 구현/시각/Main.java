import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        String h,m,s;
        int count = 0;
        
        for(int i=0; i<=N; i++) {
        	h = String.valueOf(i);
        	for(int j=0; j<60; j++) {
        		m = String.valueOf(j);
        		for(int k=0; k<60; k++) {
        			s = String.valueOf(k);
        			if(h.length() > 1) {
        				if(h.charAt(0) == '3' || h.charAt(1) == '3') {
        					count++;
        					continue;
        				}
        			}
        			else if(h.length() == 1) {
        				if(h.charAt(0) == '3') {
        					count++;
        					continue;
        				}
        			}
        			if(m.length() > 1) {
        				if(m.charAt(0) == '3' || m.charAt(1) == '3') {
        					count++;
        					continue;
        				}
        			}
        			else if(m.length() == 1) {
        				if(m.charAt(0) == '3') {
        					count++;
        					continue;
        				}
        			}
        			if(s.length() > 1) {
        				if(s.charAt(0) == '3' || s.charAt(1) =='3') {
        					count++;
        					continue;
        				}
        			}
        			else if(s.length() == 1) {
        				if(s.charAt(0) == '3') {
        					count++;
        					continue;
        				}
        			}
        		}
        	}
        }
        bw.write(String.valueOf(count));
        br.close();
        bw.flush();
        bw.close();
    }

}