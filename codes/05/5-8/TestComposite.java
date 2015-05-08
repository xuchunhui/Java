class Animal
{
	private void beat()
	{
		System.out.println("心脏跳动。。");
	}
	public void breath()
	{
		beat();
		System.out.println("呼吸中。。。");
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
		System.out.println("我能飞翔。。");
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
		System.out.println("我能奔跑。。。");
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
