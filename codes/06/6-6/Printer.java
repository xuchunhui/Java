import lee.Output;
interface Product
{
	int getProduceTime();
}
public class  Printer implements Output,Product
{
	private String[] printData = new String[MAX_CACHE_LINE];
	private int dataNum = 0;
	public void out()
	{
		while (dataNum > 0)
		{
			System.out.println("��ӡ����ӡ" + printData[0]);
			//public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
			System.arraycopy(printData, 1,printData, 0, --dataNum);//��������������һλ
		}
	}

	public void getData(String msg)
	{
		if (dataNum >= MAX_CACHE_LINE)
		{
			System.out.println("����������������ʧ��");
		}
		else
		{
			printData[dataNum++] = msg;
		}
	}
	public int getProduceTime()
	{
		return 45;
	}
	public static void main(String[] args) 
	{
		Output o = new Printer();
		o.getData("������J2EE��ҵӦ��ʵս");
		o.getData("Structs2Ȩ��ָ��");
		o.getData("Structs2Ȩ��ָ��55");
		o.out();
		o.getData("����J2EE��Ajax����");
		o.getData("Ruby On Rails ���ݿ������ʵ��");
		o.out();
		Product p = new Printer();
		System.out.println(p.getProduceTime());
		Object obj = p;
		System.out.println("Hello World!");
	}
}
