public class TestEqual 
{
	public static void main(String[] args) 
	{
		int it = 65;
		float fl = 65.0f;
		System.out.println("65��65.0�Ƿ���ȣ�" + (it == fl));
		char ch = 'A';
		System.out.println("65��'A'�Ƿ���ȣ�" + (ch == it));
		String str1 = new String("hello");
		String str2 = new String("hello");
		System.out.println("str1��str2�Ƿ���ȣ�" + (str1 == str2));
		System.out.println("str1�Ƿ�equals str2?" + str1.equals(str2));

	}
}
