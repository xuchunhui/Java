public class OverloadVarargs 
{
	public void test(String msg)
	{
	System.out.println("ֻ��һ���ַ���������test����");
	}
	public void test(String... books)
	{
		System.out.println("*****�βοɱ��test������*****");
	}
	public static void main(String[] args) 
	{
		OverloadVarargs olv = new OverloadVarargs();
		olv.test();
		olv.test("aa","bb");
		olv.test("aa");
		olv.test(new String[]{"aa"});
		System.out.println("Hello World!");
	}
}
/*  �����
*****�βοɱ��test������*****
*****�βοɱ��test������*****
ֻ��һ���ַ���������test����
*****�βοɱ��test������*****
Hello World!
*/
