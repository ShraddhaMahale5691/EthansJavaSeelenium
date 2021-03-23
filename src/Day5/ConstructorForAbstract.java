package Day5;

abstract class ConstructorForAbstract {
	
	 ConstructorForAbstract(int a)
	{
		System.out.println("This is a"+a);
	}

	 
}
class Derived1 extends ConstructorForAbstract
{
	public Derived1()
	{
		  super(1);
		System.out.println("This is derived class");
		
	}
}
