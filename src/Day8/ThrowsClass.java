package Day8;

public class ThrowsClass {
	int a,b,c;
	void division(int a,int b) throws ArithmeticException,ArrayIndexOutOfBoundsException
	{

		int c=a/b;
		this.c=c;
		System.out.println("Value of c is "+c);
		int arr[]= {1,2,3};
		System.out.println("Value of array is "+arr[10]);
	}

}

