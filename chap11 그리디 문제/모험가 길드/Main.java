import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int arr[] = new int[N];
        for(int i=0; i<N; i++) {
        	arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int count = 0;
        int result = 0;
        for(int i=0; i<N;i+=arr[i]) {
        	count++;
        	if(count >= arr[i]) {
        		result++;
        		count = 0;
        	}
        }
        bw.write(String.valueOf(result));
        br.close();
        bw.flush();
        bw.close();
    }
}