/*
�������ã��൱��ָ�룬�����Ӷ�����
������ʵ�����Ƕ�����ָ��Ķ������
*/

public class TestReferenceTransfer
{
	public static void swap(DataWrap dw)
	{
		int tmp = dw.a;
		dw.a = dw.b;
		dw.b = tmp;
		System.out.println("swap������ a="+dw.a+" b=" + dw.b);
		dw = null;
	}
	public static void main(String[] args) 
	{
		DataWrap dw = new DataWrap();
		dw.a = 6;
		dw.b = 9;
		swap(dw);
		System.out.println("����������a="+ dw.a + " b=" +dw.b);
	}
}
