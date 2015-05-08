/*
      需要理解，有难度
*/
class Singleton
{
	private static Singleton instance;
	private Singleton(){}
	public static Singleton getInstance()
	{
		if(instance == null)
		{
			instance = new Singleton();
		}
		return instance;
	}
}
public class  TestSingleton
{
	public static void main(String[] args) 
	{
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = new Singleton();
		System.out.println(s1 ==s2);
	}
}
