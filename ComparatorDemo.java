import java.util.Date;
import java.util.ArrayList;
import java.util.Collections;
public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Student1> ar = new ArrayList<Student1>();
		ar.add(new Student1(111, "bbbb", "london"));
		ar.add(new Student1(131, "aaaa", "nyc"));
		ar.add(new Student1(121, "cccc", "jaipur"));
		
		System.out.println("UNSORTED :");
		
		for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		
		Collections.sort(ar, new sortbyroll());
		
		System.out.println("\n Sorted By RollNo :");
		
		for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		
		Collections.sort(ar, new sortbyname());
		
		System.out.println("\n Sorted By Name :");
		
		for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		
		Collections.sort(ar, new sortbyaddress());
		
		System.out.println("\n Sorted By Address :");
		
		for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		

		Date d1=new Date();
		System.out.println(d1.toString());
		
	}

}


