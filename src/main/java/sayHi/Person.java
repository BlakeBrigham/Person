package sayHi;

public class Person
{
	String firstName;
	String lname;
	int age;
	/** 
	 * @param fname - First Name
	 * @param lname - Last Name
	 * @param age - age of person in years
	 */
	public Person(String fname, String lname, int age)
	{
		super();
		this.firstName = fname;
		this.lname = lname;
		this.age = age;
	}

	/**
	 * @return the fname
	 */
	public String getFname()
	{
		return firstName;
	}

	/**
	 * @param fname the fname to set
	 */
	public void setFname(String fname)
	{
		this.firstName = fname;
	}

	/**
	 * @return the lname
	 */
	public String getLname()
	{
		return lname;
	}

	@Override
	public String toString()
	{
		return "Person: " + firstName + " " + lname + ", " + age;
	}

	/**
	 * @param lname the lname to set
	 */
	public void setLname(String lname)
	{
		this.lname = lname;
	}

	/**
	 * @return the age
	 */
	public int getAge()
	{
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age)
	{
		this.age = age;
	}

	public static void main(String[] args)
	{
		Person p = new Person("Romeo", "Mon", 15);
		
		System.out.println("Person P= " + p);
	}
	
}
