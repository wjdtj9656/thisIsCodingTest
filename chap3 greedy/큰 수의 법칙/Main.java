package Baekjoon;

import java.io.*;
import java.util.*;

public class Main { 
	/*
	 * 2828 problem
	 */
	public static void main(String[] args) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int arr[] = new int[N];
		st = new StringTokenizer(br.readLine());
		boolean switchValue = false;
		int result = 0;
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());	
		}
		Arrays.sort(arr);
		
		for(int i=0; i<M; i++) {
			for(int j=0; j<K; j++) {
				i++;
				if(switchValue == false) {
					result += arr[N-1];
				}
				else {
					result += arr[N-2];
					break;
				}
			}
			i--;
			if(switchValue == false) switchValue = true;
			else { switchValue = false; }
		}
		bw.write(String.valueOf(result));
		br.close();
		bw.flush();	
		bw.close();
	}
}