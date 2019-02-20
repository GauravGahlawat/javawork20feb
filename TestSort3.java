import java.util.ArrayList;
import java.util.Collections;

public class TestSort3 {
    public static void main(String[] args) {
    	
    	ArrayList<Student> a1= new ArrayList<Student>();
    	a1.add(new Student(111,"John",29));
    	a1.add(new Student(222,"Mike",21));
    	a1.add(new Student(555,"Mary",26));
    	
    	Collections.sort(a1);
    	for(Student st:a1)
    	{
    		System.out.println(st.rollno + " " + st.name + " " + st.age);
    	}
    	System.out.println("Reverse Order :");
    	Collections.reverse(a1);
    	for(Student st:a1)
    	{
    		System.out.println(st.rollno + " " + st.name + " " + st.age);
    	}
    	
    }
}