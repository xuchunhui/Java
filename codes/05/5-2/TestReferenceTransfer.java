/*
对象引用，相当于指针，本例子对引用
操作，实际上是对引用指向的对象操作
*/

public class TestReferenceTransfer
{
	public static void swap(DataWrap dw)
	{
		int tmp = dw.a;
		dw.a = dw.b;
		dw.b = tmp;
		System.out.println("swap方法里 a="+dw.a+" b=" + dw.b);
		dw = null;
	}
	public static void main(String[] args) 
	{
		DataWrap dw = new DataWrap();
		dw.a = 6;
		dw.b = 9;
		swap(dw);
		System.out.println("交换结束后，a="+ dw.a + " b=" +dw.b);
	}
}
