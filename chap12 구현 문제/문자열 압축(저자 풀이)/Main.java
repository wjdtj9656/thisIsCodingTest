import java.util.*;
import java.io.*;

class Solution {

    public int solution(String s) {
        int answer = s.length();
        for(int i=1; i<s.length()/2+1; i++) {
        	String temp = "";
        	String prev = s.substring(0,i);
        	int count = 1;
        	for(int j=i; j<s.length(); j+=i) {
        		String sub = "";
        		for(int k=j; k<j+i; k++) {
        			if(k < s.length()) sub += s.charAt(k);
        		}
        		
        		if(prev.equals(sub)) count++;
        		
        		else {
        			temp += (count>=2) ? count + prev:prev;
        			sub="";
        			for(int k=j; k<j+i; k++) {
        				if(k < s.length()) sub+=s.charAt(k);
        			}
        			prev = sub;
        			count = 1;
        		}
        	}
        	temp += (count>=2) ? count+prev: prev;
        	answer = Math.min(answer, temp.length());
        }
        return answer;
    } 
}
public class Main {


    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	Solution solution = new Solution();
    	int r = solution.solution("aabbaccc");
    	System.out.println(r);
    	br.close();
    	bw.flush();
    	bw.close();
    }
}