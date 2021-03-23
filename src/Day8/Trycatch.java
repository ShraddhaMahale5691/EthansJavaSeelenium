package Day8;

import javax.activity.ActivityRequiredException;

public class Trycatch {
	void calc()
	{
		try {
			int a=10,b=0;
			int c=a/b;
			System.out.println("Value of c "+c);
			int arr[]= {1,2,3};
			System.out.println("Value of array"+arr[10]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("This is arithmatic exception");
		}
		
		
		System.out.println("End of prgram");
	}
}
