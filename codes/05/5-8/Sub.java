class Base
{
	public Base()
	{
		test();
	}
	public void test()
	{
		System.out.println("����������д�ķ���");
	}
}
class  Sub extends Base
{
	private String name;
	public void test()
	{
		System.out.println("������д����ķ�������name�ַ�������" + name.length());
	}
	public static void main(String[] args) 
	{
		Sub s = new Sub();
		//System.out.println("Hello World!");
	}
}
