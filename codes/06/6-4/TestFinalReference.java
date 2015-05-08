import java.util.*;
class Person
{
	private int age;
	public Person(){}
	public Person(int age)
	{
		this.age = age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}

}
public class  TestFinalReference
{
	public static void main(String[] args) 
	{
		final int[] iArr = {5,6,12,9};
		System.out.println(Arrays.toString(iArr));
		Arrays.sort(iArr);
		System.out.println(Arrays.toString(iArr));
		iArr[2] = -8;
		System.out.println(Arrays.toString(iArr));
		//iArr = null;
		final Person p = new Person(45);
		p.setAge(23);
		//p = null;
		System.out.println("Hello World!");
	}
}
