public class TestPerson 
{
	public static void main(String[] args) 
	{
		System.out.println("Person������Ϊ "+ Person.eyeNum);
		Person p = new Person();
		System.out.println("p������name����Ϊ"+p.name + 
			"eyeNum����Ϊ" + p.eyeNum);
		p.name = "Ʒ��";
		p.eyeNum = 2;
		System.out.println("p������name����Ϊ"+p.name + 
			"eyeNum����Ϊ" + p.eyeNum);
		Person p2 = new Person();
		System.out.println("p������������Ϊ" + p.eyeNum);
	}
}
