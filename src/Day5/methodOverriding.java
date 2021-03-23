package Day5;

public class methodOverriding {

	void show()
	{
		System.out.println("This is parent class");
	}
}
class child extends methodOverriding
{
	void show()
	{
		System.out.println("This is child class");
	}
	
}
