class BaseClass
{
	public int book = 6;
	public void base()
	{
		System.out.println("�������ͨ����");
	}
	public void test()
	{
		System.out.println("����ı����Ƿ���");
	}
}

public class  SubClass extends BaseClass 
{
	public String look = "Ʒ��";
	public void test()
	{
		System.out.println("���า�Ǹ���ķ���");
	}
	public void sub()
	{
		System.out.println("�������ͨ����");
	}
	public static void main(String[] args) 
	{
		BaseClass bc = new BaseClass();

		System.out.println(bc.book);
		System.out.println("******************");
		bc.base();
		bc.test();
		SubClass sc = new SubClass();

		System.out.println(sc.book);

		sc.base();
		sc.test();
		BaseClass ployBc = new SubClass();
		System.out.println(ployBc.book);

		ployBc.base();
		ployBc.test();

	}
}
