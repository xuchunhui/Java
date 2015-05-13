public class OutputFactory 
{
	public Output getOutput()
	{
		return new Printer();
	}
	public static void main(String[] args) 
	{
		OutputFactory of = new OutputFactory();
		Computer c = new Computer(of.getOutput());
		c.keyIn("������J2Ee��ҵ��Ӧ��ʵս");
		c.keyIn("Struct2Ȩ��ָ��");
		c.print();
		System.out.println("Hello World!");
	}
}
