public class TestImmutableString 
{
	public static void main(String[] args) 
	{
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println("Hello World!");
	}
}
