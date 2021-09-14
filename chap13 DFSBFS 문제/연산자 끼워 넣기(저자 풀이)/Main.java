import java.util.*;
import java.io.*;

public class Main {
	
	public static int n;
	public static ArrayList<Integer> arr = new ArrayList<>();
	public static int add, sub, mul, divi;
	public static int min = (int) 1e9;
	public static int max = (int) -1e9;
	
	public static void dfs(int i, int now) {
		if( i== n) {
			min = Math.min(min, now);
			max = Math.max(max,now);
		}
		else {
			if (add > 0) {
                add -= 1;
                dfs(i + 1, now + arr.get(i));
                add += 1;
            }
            if (sub > 0) {
                sub -= 1;
                dfs(i + 1, now - arr.get(i));
                sub += 1;
            }
            if (mul > 0) {
                mul -= 1;
                dfs(i + 1, now * arr.get(i));
                mul += 1;
            }
            if (divi > 0) {
                divi -= 1;
                dfs(i + 1, now / arr.get(i));
                divi += 1;
            }
		}
	}
    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	n = Integer.parseInt(br.readLine());
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	for(int i=0; i<n; i++) {
    		arr.add(Integer.parseInt(st.nextToken()));
    	}
    	st = new StringTokenizer(br.readLine());
    	add = Integer.parseInt(st.nextToken());
    	sub = Integer.parseInt(st.nextToken());
    	mul = Integer.parseInt(st.nextToken());
    	divi = Integer.parseInt(st.nextToken());
    	
    	dfs(1,arr.get(0));
    	bw.write(String.valueOf(max+"\n"));
    	bw.write(String.valueOf(min));
    	br.close();
    	bw.flush();
    	bw.close();
    }
}