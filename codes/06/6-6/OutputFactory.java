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
		c.keyIn("轻量级J2Ee企业家应用实战");
		c.keyIn("Struct2权威指南");
		c.print();
		System.out.println("Hello World!");
	}
}
