package Day8;

import javax.activity.ActivityRequiredException;

public class Nestedtrycatch {

	public static void main(String[] args) {
		// All exceptions are catched if nested try catch is used
		try 
		{
		 try
			{
			int a=10,b=0;
			int c=a/b;
			System.out.println("Value of C is "+c);
			}
			catch(ArithmeticException e)
			{
				System.out.println("This is arithatic exception");	
			}
		 
		    int arr[]= {1,2,3};
			System.out.println("Value of array is "+arr[10]);
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("This is Array Bound exception");
			
		}
		System.out.println("This is End of Program...................");
	}

}
