import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    int array[] = {1,23,23,4,4,32,1,4,324,23,432,42};
    int min_index = 0;
    for(int i=0; i<array.length; i++) {
    	min_index = i;
    	for(int j=i+1; j<array.length; j++) {
    		if(array[min_index] > array[j]) {
    			min_index = j;
    		}
    	}
    	int temp = array[min_index];
    	array[min_index] = array[i];
    	array[i] = temp;
    }
    for(int i=0; i<array.length; i++) {
    	bw.write(String.valueOf(array[i]+" "));
    }
    br.close();
    bw.flush();
    bw.close();
    }
}