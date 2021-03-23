package Day8;

public class throwExamle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=10;
		try
		{
			//if we donot give trycatch block jvm address it and terminate the program
			if(age<18)
			{
				//we are forcing a compliler to throw builtin exception with passing info
				throw new ArithmeticException("This is Correct Arithmatic exception");
			}
			else
			{
				System.out.println("It is eligible");
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("Ya its a arithmatic exception "+e);
		}
	}

}
