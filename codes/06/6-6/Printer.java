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
			System.out.println("打印机打印" + printData[0]);
			//public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
			System.arraycopy(printData, 1,printData, 0, --dataNum);//数组整体向下移一位
		}
	}

	public void getData(String msg)
	{
		if (dataNum >= MAX_CACHE_LINE)
		{
			System.out.println("输出队列已满，添加失败");
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
		o.getData("轻量级J2EE企业应用实战");
		o.getData("Structs2权威指南");
		o.getData("Structs2权威指南55");
		o.out();
		o.getData("基于J2EE的Ajax宝典");
		o.getData("Ruby On Rails 敏捷开发最佳实践");
		o.out();
		Product p = new Printer();
		System.out.println(p.getProduceTime());
		Object obj = p;
		System.out.println("Hello World!");
	}
}
