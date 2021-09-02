import java.util.*;
import java.io.*;
class Student{
	String name;
	int score;
	
	Student(String name,int score){
		this.name = name;
		this.score = score;
	}
}
public class Main {
	
    public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
   
    int num = Integer.parseInt(br.readLine());
    
    List<Student> students = new ArrayList<>();
    for(int i=0; i<num; i++) {
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	students.add(new Student(st.nextToken(),Integer.parseInt(st.nextToken())));
    }
    
    Comparator<Student> comparator = new Comparator<Student>() {

		@Override
		public int compare(Student o1, Student o2) {
			
			if(o1.score <= o2.score) {
				return -1;
			}
			else {
				return 1;
			}
		}
    	
    };
    Collections.sort(students,comparator);
    for(int i=0; i<students.size(); i++) {
    	bw.write(students.get(i).name+" ");
    }
    br.close();
    bw.flush();
    bw.close();
    }
}