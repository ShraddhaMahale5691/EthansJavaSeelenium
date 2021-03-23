package Day8;

public class Throwourexcep {

	void checkage(int age)
	{
		try
		{
		if(age<18)
		{
			throw new AgenotValidException();
		}
		else
		{
			System.out.println("He is eligible");
		}
	}
		catch(AgenotValidException e)
		{
			System.out.println("This is age not valid constructor "+e);
		}
	}
	
	void Nottohandle(int age) throws AgenotValidException
	{
		if(age<18)
		{
			throw new AgenotValidException();
		}
		else
		{
			System.out.println("He is eligible");
		}
	}
	
	
	
	public static void main(String[] args) throws AgenotValidException {
		// TODO Auto-generated method stub
		Throwourexcep t=new Throwourexcep();
		t.checkage(12);
		try {
			t.Nottohandle(13);
		} 
		catch (AgenotValidException e) {
			System.out.println("This is in catch of not declaration "+e);
			
		}
		
		
		Throwourexcep t1=new Throwourexcep();
		t1.Nottohandle(14);
		
	}
	}


