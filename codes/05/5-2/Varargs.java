public class  Varargs
{
	public static void test(int a, String... books)
	{
		for (String tmp:books)
		{
			System.out.println(tmp);
		}
		System.out.println(a);
	
	}
	public static void main(String[] args) 
	{
		test(5,"许多的","书籍");
		//System.out.println("Hello World!");
	}
}
