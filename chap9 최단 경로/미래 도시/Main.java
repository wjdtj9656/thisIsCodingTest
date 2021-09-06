import java.util.*;
import java.io.*;
public class Main {


    
    public static void main(String[] args) throws Exception {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       
       StringTokenizer st = new StringTokenizer(br.readLine());
       int N = Integer.parseInt(st.nextToken());
       int M = Integer.parseInt(st.nextToken());
       
       int arr[][] = new int[500][500];
       int INF = (int) 1e9;
       for(int i=0; i<500; i++) {
    	   Arrays.fill(arr[i], INF);
       }
       for(int a=1; a<=N; a++) {
    	   for(int b=1; b<=N; b++) {
    		   if(a == b) arr[a][b] = 0;
    	   }
       }
       for(int i=0; i<M; i++) {
    	   st = new StringTokenizer(br.readLine());
    	   int a = Integer.parseInt(st.nextToken());
    	   int b = Integer.parseInt(st.nextToken());
    	   arr[a][b] = 1;
    	   arr[b][a] = 1;
       }
       
       for(int k=1; k<=N; k++) {
    	   for(int a=1; a<=N; a++) {
    		   for(int b=1; b<=N; b++) {
    			   arr[a][b] = Math.min(arr[a][b], arr[a][k] + arr[k][b]);
    		   }
    	   }
       }
      
       st = new StringTokenizer(br.readLine());
       int a = Integer.parseInt(st.nextToken());
       int b = Integer.parseInt(st.nextToken());
       if(arr[a][b] == INF) {
    		bw.write(String.valueOf(-1));
       }
       else {
    		bw.write(String.valueOf((arr[1][b]+arr[b][a])+"\n"));
       }
    	   
       
       br.close();
       bw.flush();
       bw.close();
    }
}