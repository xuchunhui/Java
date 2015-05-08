public class OverloadVarargs 
{
	public void test(String msg)
	{
	System.out.println("只有一个字符串参数的test方法");
	}
	public void test(String... books)
	{
		System.out.println("*****形参可变的test方法！*****");
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
/*  结果：
*****形参可变的test方法！*****
*****形参可变的test方法！*****
只有一个字符串参数的test方法
*****形参可变的test方法！*****
Hello World!
*/
