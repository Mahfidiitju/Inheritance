package iit.ju.inheritance;

public class Teacher extends Person{
	Teacher(String s,int num)
	{
		super(s,num);
	}
	void display()
	{
		System.out.println("name "+name+ " age "+age );
	}
}
