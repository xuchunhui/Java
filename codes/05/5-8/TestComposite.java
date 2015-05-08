class Animal
{
	private void beat()
	{
		System.out.println("������������");
	}
	public void breath()
	{
		beat();
		System.out.println("�����С�����");
	}
}

class Bird
{
	private Animal a;
	public Bird(Animal a)
	{
		this.a = a;
	}
	public void breath()
	{
		a.breath();
	}
	public void fly()
	{
		System.out.println("���ܷ��衣��");
	}
}

class Wolf
{
	private Animal a;
	public Wolf(Animal a)
	{
		this.a =a ;
	}
	public void breath()
	{
		a.breath();
	}
	public void run()
	{
		System.out.println("���ܱ��ܡ�����");
	}
}

public class TestComposite 
{
	public static void main(String[] args) 
	{
		Animal al = new Animal();
		Bird b = new Bird(al);
		b.breath();
		b.fly();
		Animal a2 = new Animal();
		Wolf w = new Wolf(a2);
		w.breath();
		w.run();
		//System.out.println("Hello World!");
	}
}
