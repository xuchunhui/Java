public class TestPerson 
{
	public static void main(String[] args) 
	{
		Person p = new Person();
		p.setAge(1000);
		System.out.println("未成功设置时age = " + p.getAge());
		p.setAge(23);
		System.out.println("成功设置时 age = " + p.getAge());
		p.setName("品网");
		System.out.println("name = " + p.getName());
	}
}
