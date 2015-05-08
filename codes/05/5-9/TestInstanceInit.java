public class TestInstanceInit 
{	
	static
	{
		a = 6;
	}
	static int a = 9;
	public static void main(String[] args) 
	{
		System.out.println(new TestInstanceInit().a);
	}
}
