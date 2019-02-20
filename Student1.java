import java.util.Comparator;

class Student1
{
	int rollno;
	String name,address;
	
	// constructor
	
	public Student1(int rollno, String name, String address)
	{
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}
	
	// used to print student details in main()
	
	public String toString()
	{
		return this.rollno + " " + this.name + " " + this.address;
	}
}

class sortbyroll implements Comparator<Student1>
{
	// used for sorting in ascending order of roll number
	
	public int compare(Student1 a,Student1 b)
	{
		return a.rollno - b.rollno;
	}
}

class sortbyname implements Comparator<Student1>
{
	// used for sorting in ascending order of roll name
	
	public int compare(Student1 a,Student1 b)
	{
		return a.name.compareTo(b.name);
	}
}

class sortbyaddress implements Comparator<Student1>
{
	// used for sorting in ascending order of roll name
	
	public int compare(Student1 a,Student1 b)
	{
		return a.address.compareTo(b.address);
	}
}



