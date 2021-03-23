package Day8;

public class TryMultiplecatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try 
{
	int a=10,b=10;
	int c=a/b;
	System.out.println("Value of C is "+c);
	int arr[]= {1,2,3};
	System.out.println("Value of array is "+arr[10]);
}
catch(ArithmeticException e)
{
	System.out.println("This is Arithamatic Exception "+e);
}
catch(ArrayIndexOutOfBoundsException e)
{
	System.out.println("This is more array index which does not exist"+e);
}
catch(Exception e)
{
	System.out.println("This is General exception "+e);
}
System.out.println("This is final End of Statement");
	}

}
