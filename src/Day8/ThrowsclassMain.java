package Day8;

public class ThrowsclassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowsClass t1=new ThrowsClass();
		try
		{
		t1.division(4, 4);
		}
		catch(ArithmeticException e)
		{
			System.out.println("This is arithmatic exception");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("This is Array out of Bound Exception");
		}
	}

}
