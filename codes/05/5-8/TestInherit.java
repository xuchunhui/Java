class Animal
{
	private void beat()
	{
		System.out.println("��������������");
	}
	public void breath()
	{
		beat();
		System.out.println("�����С�����");
	}
}

class Bird extends Animal
{
	public void fly()
	{
		System.out.println("������շ��衣����");
	}
}

class Wolf extends Animal
{
	public void run()
	{
		System.out.println("����½���ϱ��ܡ�����");
	}
}
public class TestInherit 
{
	public static void main(String[] args) 
	{
		Bird b = new Bird();
		b.breath();
		b.fly();
		Wolf w = new Wolf();
		w.breath();
		w.run();
	}
}
