package Day4;

public class ConstructorDemo {
	int new1,new2;
	
	ConstructorDemo()
	{
		System.out.println("This is default constructor");
		System.out.println("Value of new1 is "+new1);
		System.out.println("Value of new2 is "+new2);
	}

	ConstructorDemo(int a,int b)
	{
		new1=a;
		new2=b;
		System.out.println("This is Parameterised constructor");
		System.out.println("Value of new1 is "+new1);
		System.out.println("Value of new2 is "+new2);
	}
}
