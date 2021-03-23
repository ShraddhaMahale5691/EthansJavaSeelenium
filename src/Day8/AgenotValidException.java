package Day8;

public class AgenotValidException extends Exception {

	AgenotValidException()
	{
		System.out.println("This is default constructor");
		
	}
	AgenotValidException(String msg)
	{
		System.out.println("This is Parameterised constructor");
	}
}
