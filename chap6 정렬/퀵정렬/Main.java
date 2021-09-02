import java.util.*;
import java.io.*;
public class Main {
	
	public static void quickSort(int arr[],int start, int end) {
		if (start >= end) return;
		
		int pivot  = start;
		int left = start + 1;
		int right = end;
		
		while(left <= right) {
			
			while(left <= end && arr[left] <= arr[pivot]) {
				left += 1;
			}
			while(right > start && arr[right] >= arr[pivot]) {
				right -= 1;
			}
			if(left > right) {
				int temp = arr[right];
				arr[right] = arr[pivot];
				arr[pivot] = temp;
			}
			else {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}
		}
		quickSort(arr,start,end-1);
		quickSort(arr,right+1,end);
	}
    public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
   
    int arr[] = {1,43245,123,231,2314,121};
    
    quickSort(arr,0,arr.length-1);
    
    for(int i:arr) {
    	System.out.println(i);
    }
    
    
    br.close();
    bw.flush();
    bw.close();
    }
}