class  IfError
{
	public static void main(String[] args) 
	{	
 		int age = 45;
		if(age > 20 )
		System.out.println("青年人");
		else if(age > 40 )
		System.out.println("中年人");
		else if(age > 60 )
		System.out.println("老年人"); 

		int i = 0 ;
		while(i < 10)
		{
			System.out.println( i++ );
		}
		System.out.println("over!");
	}
}
