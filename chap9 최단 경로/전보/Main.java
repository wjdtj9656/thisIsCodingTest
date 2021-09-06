import java.util.*;
import java.io.*;
class Node implements Comparable<Node>{
	int index;
	int value;
	
	Node(int index,int value){
		this.index = index;
		this.value = value;
	}
	@Override
	public int compareTo(Node o) {
		if(this.value < o.value) {
			return -1;
		}
		else {
			return 1;
		}
	}
	
}
public class Main {


    static int N,M,C;
    static final int INF = (int) 1e9;
    static ArrayList<ArrayList<Node>> graph = new ArrayList<ArrayList<Node>>();
    static int d[] = new int[10001];
    
    public static void dijkstra(int start) {
    	PriorityQueue<Node> q = new PriorityQueue<>();
    	q.offer(new Node(start,0));
    	d[start] = 0;
    	while(!q.isEmpty()) {
    		Node node = q.poll();
    		int dis = node.value;
    		int now = node.index;
    		
    		if(d[now] < dis) continue;
    		for(int i=0; i<graph.get(now).size(); i++) {
    			int cost = d[now] + graph.get(now).get(i).value;
    			if(cost < d[graph.get(now).get(i).index]) {
    				d[graph.get(now).get(i).index] = cost;
    				q.offer(new Node(graph.get(now).get(i).index,cost));
    			}
    		}
    	}
    }
    public static void main(String[] args) throws Exception {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       
       StringTokenizer st = new StringTokenizer(br.readLine());
       N = Integer.parseInt(st.nextToken());
       M = Integer.parseInt(st.nextToken());
       C = Integer.parseInt(st.nextToken());
       int count = 0;
       
       for(int i=0; i<=N; i++) {
    	   graph.add(new ArrayList<Node>());
       }
       for(int i=0; i<M; i++) {
    	   st = new StringTokenizer(br.readLine());
    	   int a = Integer.parseInt(st.nextToken());
    	   int b = Integer.parseInt(st.nextToken());
    	   int c = Integer.parseInt(st.nextToken());
    	   graph.get(a).add(new Node(b,c));
       }
       Arrays.fill(d, INF);
       dijkstra(C);
       int max = 0;
       for(int i=1; i<=N; i++) {
    	   if(d[i] == INF) {
    		   
    	   }
    	   else {
    		   max = Math.max(max, d[i]);
    		   count++;
    	   }
       }
       bw.write(String.valueOf(count-1+" "+max));
       br.close();
       bw.flush();
       bw.close();
    }
}