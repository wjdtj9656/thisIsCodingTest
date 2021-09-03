import java.util.*;
import java.io.*;

public class Main {
	
    public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
   
    int num = Integer.parseInt(br.readLine());
    
    LinkedList<Integer> list = new LinkedList<>();
    list.add(0);
    list.add(0);
    list.add(1);
    list.add(1);
    list.add(2);
    list.add(1);
    int temp1,temp2,temp3,temp4;
    for(int i=6; i<=num; i++) {
    	if(i%5 == 0)
    		temp1 = list.get(i/5);
    	else {
    		temp1 =(int) 1e9;
    	}
    	if(i%3 == 0)
    		temp2 = list.get(i/3);
    	else {
    		temp2 = (int) 1e9;
    	}
    	if(i%2 == 0)
    		temp3 = list.get(i/2);
    	else {
    		temp3 = (int) 1e9;
    	}
    	temp4 = list.get(i-1);
    	int minValue = Math.min(Math.min(temp1, temp2), Math.min(temp3, temp4));
    	list.add(minValue+1);
    }
    bw.write(String.valueOf(list.get(num)));
    
    br.close();
    bw.flush();
    bw.close();
    }
}