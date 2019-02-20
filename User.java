
public class User implements Comparable{
	
	String fname;
	String lname;
	int id;
	User(String f,String l,int id1)
	{
		fname=f;
		lname=l;
		id=id1;
	}
	public String toString()
	{
		return (fname + " " + lname + " " + id);
	}
	
	public int compareTo(Object o) {
		return 0;
	}

}
