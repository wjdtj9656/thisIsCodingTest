import java.util.*;
import java.io.*;

public class Main {

static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
static int N,M,K,X;
static int arr[];

    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	N = Integer.parseInt(st.nextToken());
    	M = Integer.parseInt(st.nextToken());
    	K = Integer.parseInt(st.nextToken());
    	X = Integer.parseInt(st.nextToken());
    	
    	arr = new int[N+1];
    	for(int i=0; i<=N; i++) {
    		arr[i] = -1;
    		graph.add(new ArrayList<>());
    	}
    	arr[X] = 0;
    	for(int i=1; i<=M; i++) {
    		st = new StringTokenizer(br.readLine());
    		int a = Integer.parseInt(st.nextToken());
    		int b = Integer.parseInt(st.nextToken());
    		graph.get(a).add(b);
    	}
    	Queue<Integer> q = new LinkedList<>();
    	q.add(X);
    	while(!q.isEmpty()) {
    		int temp = q.poll();
    		for(int i=0; i<graph.get(temp).size(); i++) {
    			int next = graph.get(temp).get(i);
    			
    			if(arr[next] == -1) {
    				arr[next] = arr[temp] + 1;
    				q.offer(next);
    			}
    		}
    	}
    	int count = 0;
    	for(int i=1; i<=N; i++) {
    		if(arr[i] == K) {
    			count++;
    			bw.write(String.valueOf(i+"\n"));
    		}
    	}
    	if(count == 0) {
    		bw.write(String.valueOf(-1));
    	}
    	br.close();
    	bw.flush();
    	bw.close();
    }
}