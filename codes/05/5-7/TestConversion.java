public class TestConversion 
{

	public static void main(String[] args) 
	{
		double d = 13.4;
		long l = (long)d;
		System.out.println(l);

		int in = 5;

		Object obj = "Hello";
		String objStr = (String)obj;
		System.out.println(objStr);
		Object objPri = new Integer(5);
		if(objPri instanceof String)
		{
		String str = (String)objPri;
		}//System.out.println("Hello World!");
	}
}
