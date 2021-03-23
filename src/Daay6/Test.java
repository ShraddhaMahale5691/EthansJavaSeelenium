package Daay6;

public class Test {

	Shape Create()
	{
		int ch=3;
		
		System.out.println("1.circle\n2.triangle\n3.Rectangle");
		System.out.println("You have entered value of object as "+ch);
		if(ch==1)
		{
			Circle c=new Circle();
			return c;
		}
		else if(ch==2)
		{
			triangle t=new triangle();
			return t;
			
		}
		else 
		{
			Rectangle r=new Rectangle();
			return r;
		}
		
	}
}
