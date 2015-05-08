class Person
{
	private String name;
	private String idStr;
	private Person(){}
	public Person(String name, String idStr)
	{
		this.name = name;
		this.idStr = idStr;
	}
	public String getIdStr()
	{
		return idStr;
	}
	public String getName()
	{
		return name;
	}
	public boolean equals(Object obj)
	{
		if(obj !=null && obj instanceof Person)
		{
			Person PersonObj = (Person)obj;
			if(this.getIdStr().equals(PersonObj.getIdStr()) && this.getName().equals(PersonObj.getName()))
			{
				return true;
			
			}

		}
			System.out.println("55555555");
		return false;
	}
}
public class  OverrideEqualsRight
{
	public static void main(String[] args) 
	{
		Person p1 = new Person("Ʒ��1","123");
		Person p2 = new Person("Ʒ��1","123");
		Person p3 = new Person("Ʒ��3","321");
		System.out.println("p1��p2�Ƿ���ȣ�  " + p1.equals(p2));
		System.out.println("p2��p3�Ƿ���ȣ�  " + p2.equals(p3));
		System.out.println("Hello World!");
	}
}
