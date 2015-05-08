public class PsArray 
{
	public static void main(String[] args) 
	{
		Person[] students;
		students = new Person[2];
		Person zhang = new Person();
		zhang.age = 15;
		zhang.height = 168;
		Person lee = new Person();
		lee.age = 16;
		lee.height = 165;
		students[0] = zhang;
		students[1] = lee;
		lee.info();
		students[1].info();
		
	}
}
