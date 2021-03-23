package Day4;

public class ThisExample {
	int new1,new2;
ThisExample()
	{
		System.out.println("This is default constructor");
		System.out.println("Value of new1 is "+new1);
		System.out.println("Value of new2 is "+new2);
	}

	ThisExample(int new1, int new2)
	{
		this.new1=new1;
		this.new2=new2;
		System.out.println("This is Parameterised constructor");
		System.out.println("Value of new1 is "+new1);
		System.out.println("Value of new2 is "+new2);
	}
}
