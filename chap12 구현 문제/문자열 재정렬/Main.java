import java.util.*;
import java.io.*;
public class Main {


    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	String s = br.readLine();
    	ArrayList<Character> list = new ArrayList<>();
    	int sum = 0;
    	
    	for(int i=0; i<s.length(); i++) {
    		if(Character.isLetter(s.charAt(i))) {
    			list.add(s.charAt(i));
    		}
    		else {
    			sum += s.charAt(i) -'0';
    		}
    	}
    	Collections.sort(list);
    	
    	for(int i=0; i<list.size(); i++) {
    		bw.write(list.get(i));
    	}
    	if(sum != 0) {
    		bw.write(String.valueOf(sum));
    	}
    	br.close();
    	bw.flush();
    	bw.close();
    }
}