public class TestPerson 
{
	public static void main(String[] args) 
	{
		Person p = new Person();
		p.setAge(1000);
		System.out.println("δ�ɹ�����ʱage = " + p.getAge());
		p.setAge(23);
		System.out.println("�ɹ�����ʱ age = " + p.getAge());
		p.setName("Ʒ��");
		System.out.println("name = " + p.getName());
	}
}
