package iit.ju.inheritance;

public class Person {
	String name;
	int age;
	Person(String n,int a)
	{
		name=n;
		age=a;
	}
	void print()
	{
		System.out.println(age+10);
	}
}
