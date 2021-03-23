package Day8;

public class finallyblock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			try {
				int a=10,b=10;
				//try with b=0 and arr[10]
				
				int c=a/b;
				System.out.println("Value of c "+c);
				int arr[]= {1,2,3};
				System.out.println("Value of array"+arr[1]);
			}
			catch(ArithmeticException e)
			{
				System.out.println("This is arithmatic exception");
			}
			//finally is excecuted compulsory though error aye na aye  ya correct ya incorrect error ho to bhi
			finally
			{
				System.out.println("This is Finally block ");
			}
			
			
			System.out.println("End of prgram");
		}
	}

