import java.util.*;
import java.io.*;

public class Main {
	
    public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
   
    int num = Integer.parseInt(br.readLine());
    int arr[] = new int[num+1];
    arr[0] = 1;
    arr[1] = 1;
    for(int i=2; i<=num; i++) {
    	arr[i] = arr[i-2]*2 + arr[i-1];
    }
    bw.write(String.valueOf(arr[num]));
    br.close();
    bw.flush();
    bw.close();
    }
}