class Person
{
	public boolean equals(Object obj)
	{
		return true;
	}
}
class Dog
{
}
public class OverrideEqualsError 
{
	public static void main(String[] args) 
	{
		Person p = new Person();
		System.out.println("Person对象是否 equals Dog对象" + p.equals(new Dog()));
		System.out.println("Person对象是否 equals String对象" + p.equals(new String()));
		System.out.println("Hello World!");
	}
}
