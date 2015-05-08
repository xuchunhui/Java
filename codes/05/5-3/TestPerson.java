public class TestPerson 
{
	public static void main(String[] args) 
	{
		System.out.println("Person类属性为 "+ Person.eyeNum);
		Person p = new Person();
		System.out.println("p变量的name属性为"+p.name + 
			"eyeNum属性为" + p.eyeNum);
		p.name = "品网";
		p.eyeNum = 2;
		System.out.println("p变量的name属性为"+p.name + 
			"eyeNum属性为" + p.eyeNum);
		Person p2 = new Person();
		System.out.println("p变量的类属性为" + p.eyeNum);
	}
}
