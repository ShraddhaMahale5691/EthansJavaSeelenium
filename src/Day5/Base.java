package Day5;

public class Base {
	Base(int a)
	//to call parameterised constructor we need to have super keyword in default constructor of child class
	{
		System.out.println("In base class "+a);
	}
	Base(float a)
	{
		System.out.println("In base class "+a);
	}

}
class derived extends Base
{
	derived()
	{
		super(2);
		//super(3.0);
		System.out.println("In derived class");
	}
	
}
